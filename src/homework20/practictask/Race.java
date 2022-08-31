package homework20.practictask;

/**
 * Java Pro. Homework #20
 * @author Alexej Lange
 * @version 31 Aug 2022
 */

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Race {
    public static final int CARS_COUNT = 4;
    public static final CyclicBarrier START = new CyclicBarrier(CARS_COUNT + 1);
    public static final CountDownLatch FINISH = new CountDownLatch(CARS_COUNT);
    public static final Semaphore SEMAPHORE = new Semaphore(CARS_COUNT / 2, true);
    public static final Lock LOCK = new ReentrantLock();

    public static void main(String[] args) {
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");
        Track race = new Track(new Road(60), new Tunnel(80), new Road(40));
        Car[] cars = new Car[CARS_COUNT];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(race, 20 + (int) (Math.random() * 10));
        }
        for (Car car : cars) {
            new Thread(car).start();
        }
        try {
            START.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!");
        try {
            FINISH.await();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");
        }
    }
}
