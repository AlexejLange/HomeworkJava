package homework2;

public class Cat extends Animal {
    public Cat(int runLimit) {
        super(runLimit, 0);
    }

    @Override
    public String swim(int distance) {
        return className + " can not swim.";
    }
}
