package homeworkoop;

public class Cat implements IAthlete {
    private final String name;
    private final int runLimit;
    private final float jumpLimit;

    public Cat(String name, int runLimit, float jumpLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getRunLimit() {
        return runLimit;
    }

    @Override
    public float getJumpLimit() {
        return jumpLimit;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", runLimit=" + runLimit +
                ", jumpLimit=" + jumpLimit +
                '}';
    }
}
