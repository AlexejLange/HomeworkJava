package homeworkoop;

public class JoggingTrack implements IObstacle {
    private final int length;

    public JoggingTrack(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public boolean move(IAthlete athlete) {
        System.out.println("The jogging track " + this.length + " meter length.");
        System.out.println(athlete.run(athlete.getRunLimit()));
        if (athlete.getRunLimit() >= getLength()) {
            System.out.println("Run successfully!");
            return true;
        } else {
            System.out.println("Run unsuccessfully(.");
            return false;
        }
    }
}
