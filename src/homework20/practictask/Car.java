package homework20.practictask;

import java.util.concurrent.CountDownLatch;

import static homework20.practictask.Race.*;

public class Car implements Runnable {
    private static int CARS_COUNT;
    private static boolean winner = false;

    private final Track track;
    private final int speed;
    private final String name;

    protected Car(Track track, int speed) {
        this.track = track;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public void run() {
        try {
            System.out.println(this.name + " (скорость " + this.speed + ")" + " готовится");
            Thread.sleep(500 + (int)(Math.random() * 800));
            System.out.println(this.name + " готов");
            START.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i = 0; i < track.getStages().size(); i++) {
            track.getStages().get(i).go(this);
        }
        FINISH.countDown();
        if (isWinner())
            System.out.println(this.name + " WIN!");
    }

    private synchronized boolean isWinner() {
        if (!winner) {
            try {
                LOCK.lock();
                winner = true;
            } finally {
                LOCK.unlock();
            }
            return true;
        } else {
            return false;
        }
    }
}
