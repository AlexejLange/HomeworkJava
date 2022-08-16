package homework17;

/**
 * Java Pro. Homework #17
 * @author Alexej Lange
 * @version 16 Aug 2022
 */

import com.sun.jdi.request.ThreadDeathRequest;

public class RunnableThread {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + ": start");
        Thread thread0 = new Thread(new RunnableImpl());
        Thread thread1 = new Thread(new RunnableImpl());
        Thread thread2 = new ThreadExt();
        Thread thread3 = new ThreadExt();
        Thread thread4 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        });
        Thread thread5 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        });
        thread0.start();
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        thread0.join();
        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();
        thread5.join();
        System.out.println("End");
    }
}
