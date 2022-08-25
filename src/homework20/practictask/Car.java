package homework20.practictask;

public class Car implements Runnable {
    private static int CARS_COUNT;
    private Track track;
    private int speed;
    private String name;

    public Car(Track track, int speed) {
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
            System.out.println(this.name + " готовится");
            Thread.sleep(500 + (int)(Math.random() * 800));
            System.out.println(this.name + " готов");
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i = 0; i < track.getStages().size(); i++) {
            track.getStages().get(i).go(this);
        }
    }
}
