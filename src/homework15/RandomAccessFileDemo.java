package homework15;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
    public static void main(String[] args) {
       try (RandomAccessFile raf = new RandomAccessFile("randomdemo.txt", "r")) {
           raf.seek(6);
           System.out.println((char) raf.read());
       } catch (IOException e) {
           e.printStackTrace();
       }
    }
}
