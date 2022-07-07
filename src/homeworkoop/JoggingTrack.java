package homeworkoop;

public class JoggingTrack implements IObstacle {
    private final int length;

    public JoggingTrack(int length) {
        this.length = length;
    }

    @Override
    public boolean move(IAthlete athlete) {
        return athlete.run(length);
    }
}
