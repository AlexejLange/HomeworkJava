package homework15;

import java.io.*;

public class BufferedReaderAndWriter {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter("bufferWR.txt"))) {
            for (int i = 0; i < 5; i++) {
                writer.write("Java\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(
                new FileReader("bufferWR.txt"))) {
            String str;
            while ((str = reader.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
