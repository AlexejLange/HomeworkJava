package homework20.lessonscode;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SimplestRWLockDemo {
    public static void main(String[] args) {
        final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
        for (int i = 0; i < 3; i++) {
            int index = i;
            new Thread(() -> {
                try {
                    readWriteLock.readLock().lock();
                    System.out.println("Начало чтения - " + index);
                    shortSleep(1000);
                    System.out.println("Завершение чтения - " + index);
                } finally {
                    readWriteLock.readLock().unlock();
                }
            }).start();
        }
        for (int i = 0; i < 2; i++) {
            int index = i;
            new Thread(() -> {
                try {
                    readWriteLock.writeLock().lock();
                    System.out.println("Начало записи - " + index);
                    shortSleep(1000);
                    System.out.println("Завершение записи - " + index);
                } finally {
                    readWriteLock.writeLock().unlock();
                }
            }).start();
        }
    }

    public static void shortSleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
