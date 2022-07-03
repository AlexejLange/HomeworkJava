package homeworkoop;

public class Human implements IAthlete {
    private int runLimit;
    private int jumpLimit;

    public Human(int runLimit, int jumpLimit) {
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    @Override
    public void run() {
        System.out.println("The Human is running.");
    }

    @Override
    public void jump() {
        System.out.println("The Human is jumping.");
    }

    @Override
    public int getRunLimit() {
        return this.runLimit;
    }

    @Override
    public int getJumpLimit() {
        return this.jumpLimit;
    }
}
