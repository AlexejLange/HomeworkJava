package homework22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import static homework22.ChatServer.EXIT_COMMAND;
import static homework22.ChatServer.SERVER_PORT;

public class ChatClient {
    public static void main(String[] args) {
        new ChatClient();
    }

    public ChatClient() {
        String message;
        try (Socket socket = new Socket("localhost", SERVER_PORT);
             PrintWriter writer = new PrintWriter(socket.getOutputStream());
             BufferedReader reader =
                     new BufferedReader(new InputStreamReader(socket.getInputStream()))
        ){
            System.out.println("Connection to server...");
            new Thread(new CommandHandler(writer)).start();
            do {
                message = reader.readLine();
                System.out.println(message);
            } while (!message.equals(EXIT_COMMAND));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        System.out.println("Connection closed.");
    }

    private static class CommandHandler implements Runnable {
        private final PrintWriter writer;
        private final Scanner scanner;

        public CommandHandler(PrintWriter writer) {
            this.writer = writer;
            this.scanner = new Scanner(System.in);
        }

        @Override
        public void run() {
            String message;
            do {
                message = scanner.nextLine();
                writer.println(message);
                writer.flush();
            } while (!message.equals(EXIT_COMMAND));
        }
    }
}
