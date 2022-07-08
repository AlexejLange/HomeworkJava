package homework9;

import java.util.Scanner;

public class UseEmployeesDatabase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Database database = new Database();
        database.init();

        boolean exit = false;
        String name, position, oldName;
        int salary, age;

        while (!exit) {
            System.out.println("db> ");
            String command = scanner.next();
            switch (command) {
                case "x":
                    exit = true;
                    break;
                case "c":
                    System.out.println("create> ");
                    name = scanner.next();
                    position = scanner.next();
                    salary = scanner.nextInt();
                    age = scanner.nextInt();
                    database.create(new Employee(name, position, salary, age));
                    break;
                case "r":
                    System.out.println(database.read());
                    break;
                case "u":
                    System.out.println("update> ");
                    oldName = scanner.next();
                    name = scanner.next();
                    position = scanner.next();
                    salary = scanner.nextInt();
                    age = scanner.nextInt();
                    database.update(oldName, new Employee(name, position, salary, age));
                    break;
                case "d":
                    System.out.println("delete> ");
                    name = scanner.next();
                    database.delete(name);
                    break;
                case "f":
                    System.out.println("find> ");
                    name = scanner.next();
                    System.out.println(database.find(name));
                    break;
                case "p":
                    System.out.println(database.getPositions());
                    break;
            }
        }
    }
}
