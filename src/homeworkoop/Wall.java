package homeworkoop;

public class Wall extends Obstacle {
    private final float height;

    public Wall(float height) {
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    @Override
    public boolean move(IAthlete athlete) {
        System.out.println("The wall " + this.height + " meter height.");
        athlete.jump();
        if (athlete.getJumpLimit() >= getHeight()) {
            System.out.println("Jump successfully!");
            return true;
        } else {
            System.out.println("Jump unsuccessfully(.");
            return false;
        }
    }
}
