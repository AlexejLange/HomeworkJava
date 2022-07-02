package homeworkoop;

public class Human implements IAthlete {
    int runLimit;
    int swimLimit;

    @Override
    public String run(int distance) {
        return "Obstacle overcome successfully.";
    }

    @Override
    public String jump(int distance) {
        return "Obstacle overcome successfully.";
    }
}
