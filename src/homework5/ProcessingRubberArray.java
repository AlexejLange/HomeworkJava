package homework5;

/**
 * Java Pro. Homework #5
 * @author Alexej Lange
 * @version 27 Jun 2022
 */

public class ProcessingRubberArray {
    public static void main(String[] args) {
        RubberArray array = new RubberArray(5, 10, 15, 20);
        array.addAll(25, 30);
        array.add(5);
        System.out.println(array.size() + ": " + array);
        System.out.println(array.get(2));
        array.set(6, 35);
        System.out.println(array.size() + ": " + array);
        System.out.println(array.getMax());
        System.out.println(array.getMin());
        System.out.println(array.average());
        array.remove(0);
        System.out.println(array.size() + ": " + array);
        for (Object i : array) {
            System.out.print(((int) i) + " ");
        }
    }
}
