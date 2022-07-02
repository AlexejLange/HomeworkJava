package homeworkoop;

public class Cat implements IAthlete {
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
