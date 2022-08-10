package homework15;

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
