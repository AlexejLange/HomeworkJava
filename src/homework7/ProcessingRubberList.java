package homework7;

public class ProcessingRubberList {
    public static void main(String[] args) {
        RubberList rl = new RubberList();
        rl.add(1);
        rl.add(2);
        rl.add(5);
        System.out.println(rl);
        System.out.println(rl.remove(2));
        System.out.println(rl);
        for (Object item : rl) {
            System.out.println(item);
        }
    }
}
