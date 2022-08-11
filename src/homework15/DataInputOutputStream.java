package homework15;

import java.io.*;

public class DataInputOutputStream {
    public static void main(String[] args) {
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream("demo.txt"))) {
            out.writeInt(128);
            out.writeLong(128L);
            out.writeBytes("Hello");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (DataInputStream in = new DataInputStream(new FileInputStream("demo.txt"))) {
            System.out.println(in.readInt());
            System.out.println(in.readLong());
            System.out.println(in.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
