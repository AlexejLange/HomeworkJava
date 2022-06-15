package homework20220613;

public abstract class Animal implements IAnimal {
    protected String name;
    protected String color;
    protected int age;
    static int counter;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
        counter++;
    }
}
