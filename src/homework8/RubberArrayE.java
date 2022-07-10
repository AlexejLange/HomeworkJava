package homework8;

import java.util.Arrays;
import java.util.Iterator;

public class RubberArrayE<E> implements Iterable<E>{
    private Object[] array = new Object[0];

    public RubberArrayE(E... arrayValue){
        addAll(arrayValue);
    }

    public void addAll(E... arrayValue) {
        Object[] newArray = new Object[array.length + arrayValue.length];
        System.arraycopy(array, 0, newArray, 0, array.length);
        System.arraycopy(arrayValue, 0, newArray, array.length, arrayValue.length);
        array = newArray;
    }

    public void add (E value) {
        addAll(value);
    }

    public E get(int index) {
        return (E) array[index];
    }

    public void set(int index, E value) {
        array[index] = value;
    }

    public int size() {
        return array.length;
    }

    public boolean remove(int index) {
        if (index < array.length) {
            Object[] newArray = new Object[array.length - 1];
            System.arraycopy(array, 0, newArray, 0, index);
            System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
            array = newArray;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }

//    @Override
    public Iterator<E> iterator() {
        return new Itr();
    }

    private class Itr implements Iterator {
        int cursor = 0;

        @Override
        public boolean hasNext() {
            return cursor < array.length;
        }

        @Override
        public E next() {
            return (E) array[cursor++];
        }
    }
}
