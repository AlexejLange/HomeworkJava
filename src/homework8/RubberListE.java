package homework8;

import java.util.Iterator;

public class RubberListE {
    private int size = 0;
    private RubberListE.Node first;
    private RubberListE.Node last;

    // deque methods

    public void offer(int value) {
        if (first == null) {
            first = new RubberListE.Node(null, value, null);
        } else if (last == null) {
            last = first;
            first = new RubberListE.Node(null, value, last);
            first.prev =first;
        } else {
            RubberListE.Node newFirst = new RubberListE.Node(null, value, first);
            first.prev = newFirst;
            first =newFirst;
        }
        size++;
    }

    public int poll() {
        return pop();
    }

    // stack methods

    public void push(int value) {
        add(value);
    }

    public int peek() {
        return last != null ? last.item : first.item;
    }

    public Integer pop() {
        if (size > 0) {
            int lastValue = last != null ? last.item : first.item;
            remove(size - 1);
            return lastValue;
        }
        return null;
    }

    // standard methods

    public void add(int value) {
        if (first == null) {
            first = new RubberListE.Node(null, value, null);
        } else if (last == null) {
            last = new RubberListE.Node(first, value, null);
            first.next =last;
        } else {
            RubberListE.Node newLast = new RubberListE.Node(last, value, null);
            last.next = newLast;
            last =newLast;
        }
        size++;
    }
    public boolean remove(int idx) {
        if (idx < size) {
            size--;
            if (idx == 0) {
                if (first.next == null) {
                    first = null;
                    return true;
                }
                RubberListE.Node newFirst = first.next;
                newFirst.prev = null;
                first = newFirst;
                return true;
            } else if (idx == size){
                RubberListE.Node newLast = last.prev;
                newLast.next = null;
                last = newLast;
                return true;
            } else {
                int index = 0;
                RubberListE.Node cursor = first;
                while (cursor != null) {
                    if (idx == index) {
                        RubberListE.Node prev = cursor.prev;
                        RubberListE.Node next = cursor.next;
                        prev.next = next;
                        next.prev = prev;
                        cursor.next = null;
                        cursor.prev = null;
                        return true;
                    }
                    cursor = cursor.next;
                    index++;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        RubberListE.Node cursor = first;
        while (cursor != null) {
            sb.append(cursor.item);
            if (cursor.next != null) {
                sb.append(", ");
            }
            cursor = cursor.next;
        }
        return sb.append("]").toString();
    }

//    @Override
    public Iterator iterator() {
        return new Itr();
    }

    private class Itr implements Iterator {
        RubberListE.Node cursor = first;

        @Override
        public boolean hasNext() {
            return cursor != null;
        }

        @Override
        public Object next() {
            int value = cursor.item;
            cursor = cursor.next;
            return value;
        }
    }

    protected static class Node {
        int item;
        RubberListE.Node next;
        RubberListE.Node prev;

        public Node(RubberListE.Node prev, int item, RubberListE.Node next) {
            this.item = item;
            this.next = next;
            this.prev = prev;
        }
    }
}
