package homework2;

/**
 * Java Pro. Homework #2
 * @author Alexej Lange
 * @version 16 Jun 2022
 */

public class ProcessingOfAnimals {
    public static void main(String[] args) {
        IAnimal[] animals = {
            new Dog(500, 10),
            new Cat(200)
        };
        for (IAnimal animal : animals) {
            System.out.println(animal);
            System.out.println();
            System.out.println(animal.run(550));
            System.out.println(animal.run(330));
            System.out.println(animal.run(150));
            System.out.println(animal.swim(15));
            System.out.println(animal.swim(5));
            System.out.println();
        }
        System.out.println("Total animals: " + Animal.getCounter() + ".");
    }
}
