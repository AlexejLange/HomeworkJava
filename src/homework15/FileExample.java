package homework15;

/**
 * Java Pro. Homework #15
 * @author Alexej Lange
 * @version 15 Aug 2022
 */

import java.io.File;

public class FileExample {
    public static void main(String[] args) {
        File file = new File("12345.bin");
        System.out.println(file.exists());
        System.out.println(file.getName());
        System.out.println(file.isFile());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.length());
        System.out.println(file.isDirectory());
    }

}
