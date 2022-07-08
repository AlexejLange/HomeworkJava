package homework9;

import java.util.Scanner;

public class UseEmployeesDatabase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Database database = new Database();
        database.init();

        boolean exit = false;
        String name, position;
        int salary, age, index;

        while (!exit) {
            System.out.println("db> ");
            String command = scanner.next();
            switch (command) {
                case "x" -> exit = true;
                case "c" -> {
                    System.out.println("create> ");
                    name = scanner.next();
                    position = scanner.next();
                    salary = scanner.nextInt();
                    age = scanner.nextInt();
                    database.create(new Employee(name, position, salary, age));
                }
                case "r" -> System.out.println(database.read());
                case "u" -> {
                    System.out.println("update> ");
                    index = scanner.nextInt();
                    name = scanner.next();
                    position = scanner.next();
                    salary = scanner.nextInt();
                    age = scanner.nextInt();
                    database.update(index, new Employee(name, position, salary, age));
                }
                case "d" -> {
                    System.out.println("delete> ");
                    index = scanner.nextInt();
                    database.delete(index);
                }
                case "p" -> System.out.println(database.getPositions());
            }
        }
    }
}
