package homework15;

import java.io.*;

public class BufferInputOutputStream {
    public static void main(String[] args) {
        long time;
        File file = new File("big.file.bin");

        try (OutputStream out = new BufferedOutputStream(new FileOutputStream(file))) {
            for (int i = 0; i < 1_000_000; i++) {
                out.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        time = System.currentTimeMillis();
        try (InputStream in = new BufferedInputStream(new FileInputStream(file))) {
            int x;
            while ((x = in.read()) != -1) {
                System.out.println((char) x);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println((System.currentTimeMillis() - time) + "ms");

        time = System.currentTimeMillis();
        try (InputStream in = new FileInputStream(file)) {
            int x;
            while ((x = in.read()) != -1) {
                System.out.println((char) x);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println((System.currentTimeMillis() - time) + "ms");
    }
}
