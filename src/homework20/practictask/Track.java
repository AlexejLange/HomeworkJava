package homework20.practictask;

import java.util.ArrayList;
import java.util.Arrays;

public class Track {
    private ArrayList<Stage> stages;

    public Track(Stage... stages) {
        this.stages = new ArrayList<>(Arrays.asList(stages));
    }

    public ArrayList<Stage> getStages() {
        return stages;
    }
}
