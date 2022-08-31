package homework21;

import homework19.HelloServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args) {
        new EchoServer();
    }

    public EchoServer() {
        try (ServerSocket server = new ServerSocket(2048)) {
            System.out.println("Server started.....");
            while (true) {
                Socket socket = server.accept();
                System.out.println("Connection to client...");
                BufferedReader reader =
                        new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter writer = new PrintWriter(socket.getOutputStream());
                String message;
                do {
                    message = reader.readLine();
                    writer.println("Echo: " + message);
                    System.out.println("Client: " + message);
                } while (!message.equals("exit"));
                writer.close();
                reader.close();
                System.out.println("Client disconnected.");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
