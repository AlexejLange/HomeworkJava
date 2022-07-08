package homework9;

import java.util.Scanner;

public class UseEmployeesDatabase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Database database = new Database();
        database.init();

        boolean exit = false;
        String name;

        while (!exit) {
            System.out.println("db> ");
            String command = scanner.next();
            switch (command) {
                case "x":
                    exit = true;
                    break;
                case "c":
                    System.out.println("create> ");
                    database.create(Employee.createEmployee());
                    break;
                case "r":
                    System.out.println(database.read());
                    break;
                case "u":
                    System.out.println("update> ");
                    database.create(Employee.createEmployee());
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
