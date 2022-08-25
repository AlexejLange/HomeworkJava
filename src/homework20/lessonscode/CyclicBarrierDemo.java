package homework20.lessonscode;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(5);
        for (int i = 0; i < 5; i++) {
            int index = i;
            new Thread(() -> {
                try {
                    System.out.println("Подготавливается " + index);
                    Thread.sleep(2000 + 500 * (int) (Math.random() * 10));
                    System.out.println("Готов " + index);
                    cyclicBarrier.await();
                    System.out.println("Поехал " + index);
                    Thread.sleep(2000 + 500 * (int) (Math.random() * 10));
                    System.out.println("Доехал " + index);
                    cyclicBarrier.await(); // 4 3 2 1 0
                    System.out.println("Гонка закончилась " + index);

                } catch (InterruptedException | BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
