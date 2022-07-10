package homework8;

import homework5.RubberArray;
import homework7.RubberList;

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
        System.out.println();
        System.out.println("-------------------------------");
        RubberListE<Integer> rl = new RubberListE<>();
        rl.add(1);
        rl.add(2);
        rl.add(5);
        System.out.println(rl);
        for (Object item : rl) {
            System.out.print(item + " ");
        }
        System.out.println();
        RubberListE<String> rlStr = new RubberListE<>();
        rlStr.add("A");
        rlStr.add("B");
        rlStr.add("C");
        System.out.println(rlStr);
        rlStr.remove(1);
        for (Object item : rlStr) {
            System.out.print(item + " ");
        }
    }
}
