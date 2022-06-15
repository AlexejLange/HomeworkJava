package homework20220613;

/**
 * Java Pro. Homework #2
 * @author Alexej Lange
 * @version 15 Jun 2022
 */

public class ProcessingOfAnimals {
    public static void main(String[] args) {
        Animal[] animals = {
            new Dog("Rex", "gray", 3),
            new Cat("Marquis", "black", 2)
        };
        for (Animal animal : animals) {
            System.out.println(animal);
            System.out.println(animal.run(150));
            System.out.println(animal.swim(15));
        }
    }
}
