package homework6;

/**
 * Java Pro. Homework #6
 * @author Alexej Lange
 * @version 29 Jun 2022
 */

public class ProcessingSimpleBox {
    public static void main(String[] args) {
        SimpleBox<Integer> box1 = new SimpleBox<>(5);
        SimpleBox<Integer> box2 = new SimpleBox<>(6);
        System.out.println(box1.getObject() + box2.getObject());
        System.out.println(box1.getType());

/*
        SimpleBox<String> box3 = new SimpleBox<>("Hello ");
        SimpleBox<String> box4 = new SimpleBox<>("Java!");
        System.out.println(box3.getObject() + box4.getObject());
        System.out.println(box3.getType());
*/
        SimpleBox<Float> box5 = new SimpleBox<>(54.69f);
        SimpleBox<Float> box6 = new SimpleBox<>(6.3f);
        box6.setObject(68.31f);
        System.out.println(box5.getObject() + box6.getObject());
        System.out.println(box5.getType());
    }
}
