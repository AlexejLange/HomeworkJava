package homework20.practictask;

import java.util.ArrayList;
import java.util.Arrays;

public class Track {
    private final ArrayList<Stage> stages;

    protected Track(Stage... stages) {
        this.stages = new ArrayList<>(Arrays.asList(stages));
    }

    public ArrayList<Stage> getStages() {
        return stages;
    }
}
