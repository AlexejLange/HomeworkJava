package homework20220613;

public class Dog extends Animal {
    public Dog(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public String toString() {
        return "Dog: " +
                "name " + name  +
                ", color " + color +
                ", age " + age +
                '.';
    }

    @Override
    public String run(int distance){
        if (distance >= 0 && distance <= 500) {
            return "The dog run " + distance + " meter.";
        } else {
            return "The dog can not run this distance.";
        }
    }

    @Override
    public String swim(int distance) {
        if (distance >= 0 && distance <= 10) {
            return "The dog swim " + distance + " meter.";
        } else {
            return "The dog can not swim this distance.";
        }
    }
}
