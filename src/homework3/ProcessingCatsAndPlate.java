package homework3;

/**
 * Java Pro. Homework #3
 * @author Alexej Lange
 * @version 19 Jun 2022
 */

public class ProcessingCatsAndPlate {
    public static void main(String[] args) {
        Cat[] catArray = {
                new Cat("Tom", 3,false),
                new Cat("Bars", 5,false),
                new Cat("Mark", 4,false),
                new Cat("Leon", 6,false)
        };
        Plate plate = new Plate(10);

        for (Cat cat : catArray) {
            cat.eat(plate);
            System.out.println(cat);
            if (!cat.satiety) {
                plate.addFood(cat.needFood(plate, cat.appetite));
                cat.eat(plate);
                System.out.println(cat);
            }
        }
        System.out.println(plate);

        // check satiated cat doesn't eat
        plate.addFood(10);
        System.out.println("________________________");
        for (Cat satiatedCat : catArray) {
            satiatedCat.eat(plate);
        }
        System.out.println(plate);
    }
}
