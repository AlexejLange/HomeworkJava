package homework21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {
    public static void main(String[] args) {
        new EchoClient();
    }

    public EchoClient() {
        String message;
        try (Socket socket = new Socket("localhost", 2048);
             PrintWriter writer = new PrintWriter(socket.getOutputStream())
//             ;
//             BufferedReader reader =
//                new BufferedReader(new InputStreamReader(socket.getInputStream()))
        ){
            System.out.println("Connection to server...");
            Scanner scanner = new Scanner(System.in);
            do {
                message = scanner.nextLine();
                writer.println(message);
                writer.flush();
//                System.out.println(reader.readLine());
            } while (!message.equals("exit"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        System.out.println("Connection closed.");
    }
}
