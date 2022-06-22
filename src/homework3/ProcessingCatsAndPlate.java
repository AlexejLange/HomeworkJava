package homework3;

/**
 * Java Pro. Homework #3
 * @author Alexej Lange
 * @version 19 Jun 2022
 */

public class ProcessingCatsAndPlate {
    public static void main(String[] args) {
        Cat[] catArray = {
                new Cat("Tom", 3),
                new Cat("Bars", 5),
                new Cat("Mark", 4),
                new Cat("Leon", 6)
        };
        Plate plate = new Plate(11);

        for (Cat cat : catArray) {
            cat.eat(plate);
            System.out.println(cat);
        }
        System.out.println(plate);

        // check satiated cat doesn't eat
        plate.addFood(11);
        System.out.println("________________________");
        for (Cat cat : catArray) {
            cat.eat(plate);
            System.out.println(cat);
        }
        System.out.println(plate);
    }
}
