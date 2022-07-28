package homework12.lambda;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UseLambdaExpressions {
    public static void main(String[] args) {
        RunLambda runLambda = () -> System.out.println("Hello, lambda!");
        runLambda.run();
        runLambda = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.print(i);
            }
        };
        runLambda.run();
        System.out.println();
        ReturnValue value = Integer::sum;
        System.out.println(value.exec(3,3));
        value = (a, b) -> a * b;
        System.out.println(value.exec(3,3));

        BinaryOperator<String> add = (a, b) -> a + b;
        System.out.println(add.apply("2", "2"));

        UnaryOperator<Integer> twice = UseLambdaExpressions::dd;
        System.out.println(twice.apply(5));
    }

    public static int dd(int a) {
        return a * 2;
    }
}
