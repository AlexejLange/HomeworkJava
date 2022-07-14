package homework10;

import java.util.Arrays;
import java.util.Collection;

public class InitDatabase {
    public static Collection<ComparatorEmployee> initData;

    static {
        initData = Arrays.asList(new ComparatorEmployee("John", "director", 1250, 46),
            new ComparatorEmployee("Joy", "assistant", 750, 23),
            new ComparatorEmployee("Mark", "engineer", 1050, 42),
            new ComparatorEmployee("Karl", "engineer", 1025,38),
            new ComparatorEmployee( "Elza", "assistant",950,32));
    }

    public static Collection<ComparatorEmployee> getInitData() {
        return initData;
    }
}
