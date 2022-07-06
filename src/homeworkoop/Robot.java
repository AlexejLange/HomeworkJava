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
    public int getRunLimit() {
        return this.runLimit;
    }

    @Override
    public float getJumpLimit() {
        return this.jumpLimit;
    }

    @Override
    public String run(int runLimit) {
        return "The Robot " + getName() + " can run " + runLimit + " m.";
    }

    @Override
    public String jump(float jumpLimit) {
        return "The Robot " + getName() + " can jump " + jumpLimit + " m.";
    }
}
