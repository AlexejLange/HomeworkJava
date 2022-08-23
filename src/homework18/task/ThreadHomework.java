package homework18.task;

import java.util.Arrays;

public class ThreadHomework {
    static final int SIZE = 10_000_000;
    static final int HALF = SIZE / 2;

    public static void main(String[] args) {
        float[] firstArray = firstMethod();
        float[] secondArray = secondMethod();
        System.out.println(Arrays.equals(firstArray, secondArray));
    }

    public static float[] firstMethod() {
        float[] array = new float[SIZE];
        Arrays.fill(array, 1.0f);
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < array.length; i++) {
            array[i] = (float) (array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("One thread time: " + (System.currentTimeMillis() - startTime) + " ms.");
        return array;
    }

    public static float[] secondMethod() {
        float[] startArray = new float[SIZE];
        Arrays.fill(startArray, 1.0f);
        long startTime = System.currentTimeMillis();
        float[] leftArray = new float[HALF];
        float[] rightArray = new float[HALF];
        System.arraycopy(startArray, 0, leftArray, 0, HALF);
        System.arraycopy(startArray, HALF, rightArray, 0, HALF);
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < leftArray.length; i++) {
                leftArray[i] = (float) (leftArray[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < rightArray.length; i++) {
                rightArray[i] = (float) (rightArray[i] * Math.sin(0.2f + (i+HALF) / 5) * Math.cos(0.2f + (i+HALF) / 5) * Math.cos(0.4f + (i+HALF) / 2));
            }
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        float[] finishArray = new float[SIZE];
        System.arraycopy(leftArray, 0, finishArray, 0, HALF);
        System.arraycopy(rightArray, 0, finishArray, HALF, HALF);
        System.out.println("Two thread time: " + (System.currentTimeMillis() - startTime) + " ms.");
        return finishArray;
    }
}

