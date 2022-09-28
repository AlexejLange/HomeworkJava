package homework24;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MarkingAnnotation {
}

public class AnnotationSecond {
    public static void main(String[] args) {
        Method[] methods = AnnotationSecond.class.getDeclaredMethods();
        for (Method o : methods) {
            if(o.getAnnotation(MarkingAnnotation.class) != null) {
                System.out.println(o);
            }
        }
    }
}
