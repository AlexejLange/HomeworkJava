package homework10;

public class Wall implements IObstacle {
    private final float height;

    public Wall(float height) {
        this.height = height;
    }

    @Override
    public boolean move(IAthlete athlete) {
       return athlete.jump(athlete.getName(), height, athlete.getJumpLimit());
    }
}
