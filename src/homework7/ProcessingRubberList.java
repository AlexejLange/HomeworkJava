package homework7;

/**
 * Java Pro. Homework #7
 * @author Alexej Lange
 * @version 03 Jul 2022
 */

public class ProcessingRubberList {
    public static void main(String[] args) {
        RubberList rl = new RubberList();
        rl.add(1);
        rl.add(2);
        rl.add(5);
        System.out.println(rl);
        rl.remove(2);
        System.out.println(rl);
        System.out.println(rl.remove(0));
        System.out.println(rl);
        System.out.println("------------------------------");
        rl.push(3);
        rl.push(54);
        rl.push(12);
        System.out.println(rl);
        System.out.println(rl.peek());
        rl.pop();
        System.out.println(rl);
        System.out.println("------------------------------");
        rl.offer(26);
        rl.offer(15);
        System.out.println(rl);
        rl.poll();
        System.out.println(rl.poll());
        System.out.println(rl);
        System.out.println("------------------------------");
        for (Object item : rl) {
            System.out.println(item);
        }
    }
}
