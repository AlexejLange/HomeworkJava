package homeworkoop;

public class Robot implements IAthlete {
    private int runLimit;
    private int jumpLimit;

    public Robot(int runLimit, int jumpLimit) {
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    @Override
    public void run() {
        System.out.println("The Robot is running.");
    }

    @Override
    public void jump() {
        System.out.println("The Robot is jumping.");
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
