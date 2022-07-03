package homeworkoop;

public class Wall extends Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public int getHeight() {
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
