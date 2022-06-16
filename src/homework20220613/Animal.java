package homework20220613;

public abstract class Animal implements IAnimal {
    protected int runLimit;
    protected int swimLimit;
    protected String className;
    private static int counter;

    static {
        counter = 0;
    }

    public Animal(int runLimit, int swimLimit) {
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        className = getClass().getSimpleName();
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public String run(int distance){
        if (distance >= 0 && distance <= runLimit) {
            return className + " run " + distance + " meter.";
        } else {
            return className + " can not run this distance.";
        }
    }

    public String swim(int distance) {
        if (distance >= 0 && distance <= swimLimit) {
            return className + " swim " + distance + " meter.";
        } else {
            return className + " can not swim this distance.";
        }
    }

    @Override
    public String toString() {
        return "The " + className +
                ": runLimit " + runLimit + " meter" +
                ", swimLimit " + swimLimit + " meter.";
    }
}
