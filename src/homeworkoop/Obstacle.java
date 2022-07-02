package homeworkoop;

public class Obstacle {
    protected int length;
    protected int height;

    public Obstacle(int length, int height) {
        this.length = length;
        this.height = height;
    }

    public boolean move(int distance) {
        return true;
    }
}
