package homework8;

import homework5.RubberArray;

import java.util.Iterator;

public class UseRubberArrayAndListE {
    public static void main(String[] args) {
        RubberArrayE<Integer> array = new RubberArrayE<>(5, 10, 15, 20);
        array.addAll(25, 30);
        array.add(5);
        System.out.println(array.size() + ": " + array);
        Iterator<Integer> iterator = array.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        RubberArrayE<String> arrayStr = new RubberArrayE<>("A", "B", "C");
        arrayStr.addAll("D", "E");
        System.out.println(arrayStr);
        arrayStr.remove(4);
        Iterator<String> iteratorStr = arrayStr.iterator();
        while (iteratorStr.hasNext()) {
            System.out.print(iteratorStr.next() + " ");
        }
        System.out.println("-------------------------------");
    }
}
