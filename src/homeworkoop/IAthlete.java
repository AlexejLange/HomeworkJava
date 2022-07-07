package homeworkoop;

public interface IAthlete {
    default boolean run(int distance, int runLimit) {
        System.out.printf(getName() + " %s run %d m.%n",
                distance <= runLimit? "successfully" : "didn't", distance);
        return distance <= runLimit;
    }

    default boolean jump(float height, float jumpLimit) {
        System.out.printf(getName() + " %s jump %f m.%n",
                height <= jumpLimit? "successfully" : "didn't", height);
        return height <= jumpLimit;
    }

    String getName();
    int getRunLimit();
    float getJumpLimit();
}
