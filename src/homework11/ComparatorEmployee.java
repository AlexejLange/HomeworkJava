package homework11;

import java.util.Scanner;

public class ComparatorEmployee {
    private final String name;
    private final String position;
    private final int salary;
    private final int age;

    public ComparatorEmployee(String name, String position, int salary, int age) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.age = age;
    }

    public static ComparatorEmployee scanEmployee() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String position = scanner.next();
        int salary = scanner.nextInt();
        int age = scanner.nextInt();
        return new ComparatorEmployee(name, position, salary, age);
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
