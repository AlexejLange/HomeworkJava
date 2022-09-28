package homework24;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings({"rawtypes", "unchecked"})
public class AnnotationFirst {
    public static void main(String[] args) {
        AnnotationFirst a = new AnnotationFirst();
        a.testSuppressWarning();
        a.oldMethod();
    }

    @Deprecated(since = "4.5", forRemoval = true)
    public void oldMethod() {
        System.out.println("This is the legacy function");
    }

    public void testSuppressWarning() {
        Map testMap = new HashMap();
        testMap.put(1, "Item_1");
        testMap.put(2, "Item_2");
        testMap.put(3, "Item_3");
    }
}
