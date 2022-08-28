package homework20.lessonscode;

import java.util.concurrent.CountDownLatch;

public class SimpleCDLDemo {
    public static void main(String[] args) throws InterruptedException {
        // задаем количество потоков
        final int THREADS_COUNT = 6;
        // задаем значение счетчика
        final CountDownLatch cdl = new CountDownLatch(THREADS_COUNT);
        System.out.println("Начинаем");
        for (int i = 0; i < THREADS_COUNT; i++) {
            final int w = i;
            new Thread(() -> {
                try {
                    // считаем, что выполнение задачи занимает ~1 сек
                    Thread.sleep(500 + (int)(500 * Math.random()));
                    cdl.countDown();
                    // как только задача выполнена, уменьшаем счетчик
                    System.out.println("Поток #" + w + " - готов");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
        // пока счетчик не приравняется нулю, будем стоять на этой строке
        cdl.await();
        // как только все потоки выполнили свои задачи - пишем сообщение
        System.out.println("Работа завершена");
    }

}
