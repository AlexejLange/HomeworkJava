package homework10;

public interface IAthlete {

    default boolean run(String name, int distance, int runLimit) {
        System.out.printf(name + " %s run %d m.%n",
                distance <= runLimit? "successfully" : "didn't", distance);
        return distance <= runLimit;
    }

    default boolean jump(String name, float height, float jumpLimit) {
        System.out.printf(name + " %s jump %f m.%n",
                height <= jumpLimit? "successfully" : "didn't", height);
        return height <= jumpLimit;
    }

    String getName();
    int getRunLimit();
    float getJumpLimit();
}
