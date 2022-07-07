package homeworkoop;

public class Robot implements IAthlete {
    private final String name;
    private final int runLimit;
    private final float jumpLimit;

    public Robot(String name, int runLimit, float jumpLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public boolean run(int distance) {
        System.out.printf(getName() + " %s run %d m.%n",
                distance <= runLimit? "successfully" : "didn't", distance);
        return distance <= runLimit;
    }

    @Override
    public boolean jump(float height) {
        System.out.printf(getName() + " %s jump %f m.%n",
                height <= jumpLimit? "successfully" : "didn't", height);
        return height <= jumpLimit;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                ", runLimit=" + runLimit +
                ", jumpLimit=" + jumpLimit +
                '}';
    }
}
