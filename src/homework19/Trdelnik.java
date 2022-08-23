package homework19;

/**
 * Java Pro. Homework #19
 * @author Alexej Lange
 * @version 24 Aug 2022
 */

import java.util.Objects;

public class Trdelnik {
    private int countTrdlo = 0;
    private final Object mon = new Object();

    public static void main(String[] args) throws InterruptedException {
        Trdelnik trdlo = new Trdelnik();
        Thread cook = new Thread(trdlo::cookTrdlo);
        Thread buy = new Thread(trdlo::buyTrdlo);
        cook.start();
        buy.start();
        cook.join();
        buy.join();
        System.out.println(trdlo.countTrdlo);
    }

    private void cookTrdlo() {
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(100);
                synchronized (mon) {
                    if (countTrdlo == 1) {
                        mon.wait();
                    }
                    System.out.println("Trdelnik is cooked");
                    countTrdlo++;
                    mon.notify();
                }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    private void buyTrdlo() {
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(100);
                synchronized (mon) {
                    if (countTrdlo == 0) {
                        mon.wait();
                    }
                    if (countTrdlo == 1) {
                        countTrdlo--;
                        System.out.println("Client is happy");
                    } else if (countTrdlo > 1) {
                        countTrdlo--;
                        System.out.println("Client is not so happy");
                    } else {
                        System.out.println("Client is very unhappy");
                    }
                    mon.notify();
                }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
