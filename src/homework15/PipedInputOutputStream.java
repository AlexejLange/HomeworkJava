package homework15;


import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedInputOutputStream {
    public static void main(String[] args) {
        try (PipedInputStream in = new PipedInputStream();
             PipedOutputStream out = new PipedOutputStream(in)) {
            for (int i = 0; i < 10; i++) {
                out.write(i);
            }

            int x;
            while ((x = in.read()) != -1) {
                System.out.print(x + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
