package homework4;

import java.util.Arrays;

public class RubberArray {
    private int[] array;


    public void add(int value) {
        if (array == null) {
            array = new int[1];
            array[0] = value;
        } else {
            int[] newArray = new int[array.length + 1];
            System.arraycopy(array, 0, newArray, 0, array.length);
            newArray[array.length] = value;
            array = newArray;
        }
    }

    public Integer get(int index) {
        if (array != null) {
            if (index < array.length) {
                return array[index];
            } else {
                return null;
            }
        } else{
            return null;
        }
    }

    public int size() {
        return array == null ? 0 : array.length;
    }

    public void remove(int index) {
        if (array != null) {
            if (index < array.length) {
                int[] newArray = new int[array.length - 1];
                System.arraycopy(array, 0, newArray, 0, index);
                System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
                array = newArray;
            }
        }
    }

    public Integer getMax() {
        if (array.length > 0) {
            int maxValue = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > maxValue) {
                    maxValue = array[i];
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
            for (int i = 1; i < array.length; i++) {
                if (array[i] < minValue) {
                    minValue = array[i];
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
            for (int i = 1; i < array.length; i++) {
                sum += array[i];
                }
            return sum / array.length;
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        return array == null ? "[]" : Arrays.toString(array);
    }
}
