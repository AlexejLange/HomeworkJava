package homework15;

import java.io.*;
import java.util.*;

public class SequenceInputStreamExample {
    public static void main(String[] args) {
        try (SequenceInputStream seq = new SequenceInputStream(new FileInputStream("1.txt"),
             new FileInputStream("2.txt"));
             FileOutputStream out = new FileOutputStream("3.txt")) {
            int rb = seq.read();
            while (rb != -1) {
                out.write(rb);
                rb = seq.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
