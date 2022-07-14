package homework10;

/**
 * Java Pro. Homework #10
 * @author Alexej Lange
 * @version 14 Jul 2022
 */

import java.util.Scanner;

public class UseComparatorDatabase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ComparatorDatabase database = new ComparatorDatabase();
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
                    database.create(ComparatorEmployee.scanEmployee());
                    break;
                case "r":
                    System.out.println(database.read());
                    break;
                case "u":
                    System.out.println("update> ");
                    database.create(ComparatorEmployee.scanEmployee());
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
