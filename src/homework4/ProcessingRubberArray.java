package homework4;

/**
 * Java Pro. Homework #4
 * @author Alexej Lange
 * @version 22 Jun 2022
 */

public class ProcessingRubberArray {
    public static void main(String[] args) {
        RubberArray array = new RubberArray();
        array.add(5);
        array.add(10);
        array.add(15);
        array.add(20);
        System.out.println(array.size() + ": " + array);
        System.out.println(array.get(2));
        System.out.println(array.getMax());
        System.out.println(array.getMin());
        System.out.println(array.average());
        array.remove(0);
        System.out.println(array.size() + ": " + array);
        array.remove(2);
        System.out.println(array.size() + ": " + array);
        array.remove(1);
        System.out.println(array.size() + ": " + array);
        array.remove(0);
        System.out.println(array.size() + ": " + array);
        System.out.println(array.get(2));
        System.out.println(array.getMax());
        System.out.println(array.getMin());
        System.out.println(array.average());
    }
}
