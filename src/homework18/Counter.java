package homework18;

import java.util.Objects;

public class Counter {
    private int value;

    public Counter() {
        this.value = 0;
    }

    public synchronized void increment() {
            value++;
    }

    public synchronized void decrement() {
        value--;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "value=" + value +
                '}';
    }
}
