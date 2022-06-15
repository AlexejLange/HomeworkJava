package homework20220613;

public class Cat extends Animal {
    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public String toString() {
        return "Cat: " +
                "name " + name  +
                ", color " + color +
                ", age " + age +
                '.';
    }

    @Override
    public String run(int distance) {
        if (distance >= 0 && distance <= 200) {
            return "The cat run " + distance + " meter.";
        } else {
            return "The cat can not run this distance.";
        }
    }

    @Override
    public String swim(int distance) {
        return "The cat can not swim.";
    }
}
