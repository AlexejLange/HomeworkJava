package homework5;

import java.util.Arrays;
import java.util.Iterator;

public class RubberArray implements Iterable {
    private int[] array = new int[0];

    public RubberArray(int... arrayValue){
        addAll(arrayValue);
    }

    public void addAll(int... arrayValue) {
        int[] newArray = new int[array.length + arrayValue.length];
        System.arraycopy(array, 0, newArray, 0, array.length);
        System.arraycopy(arrayValue, 0, newArray, array.length, arrayValue.length);
        array = newArray;
    }

    public void add (int value) {
        addAll(value);
    }

    public int get(int index) {
        return array[index];
    }

    public void set(int index, int value) {
        array[index] = value;
    }

    public int size() {
        return array.length;
    }

    public boolean remove(int index) {
        if (index < array.length) {
            int[] newArray = new int[array.length - 1];
            System.arraycopy(array, 0, newArray, 0, index);
            System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
            array = newArray;
            return true;
        }
        return false;
    }

    public Integer getMax() {
        if (array.length > 0) {
            int maxValue = array[0];
            for (int i : array) {
                if (i > maxValue) {
                    maxValue = i;
                }
            }
            return maxValue;
        } else {
            return null;
        }
    }

    public Integer getMin() {
        if (array.length > 0) {
            int minValue = array[0];
            for (int i : array) {
                if (i < minValue) {
                    minValue = i;
                }
            }
            return minValue;
        } else {
            return null;
        }
    }

    public Double average() {
        if (array.length > 0) {
            double sum = array[0];
            for (int i : array) {
                sum += i;
            }
            return sum / array.length;
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }

    @Override
    public Iterator iterator() {
        return new Itr();
    }

    private class Itr implements Iterator {
        int cursor = 0;

        @Override
        public boolean hasNext() {
            return cursor < array.length;
        }

        @Override
        public Object next() {
            return array[cursor++];
        }
    }
}
