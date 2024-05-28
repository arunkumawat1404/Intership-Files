import java.io.*;
import java.net.*;

public class Server2 {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket clientSocket = null;
        PrintWriter out = null;

        try {
            // Create a server socket bound to port 12345
            serverSocket = new ServerSocket(12345);
            System.out.println("Server started. Waiting for a client...");

            // Accept a connection from the client
            clientSocket = serverSocket.accept();
            System.out.println("Client connected.");

            // Create a PrintWriter object to send a message to the client
            out = new PrintWriter(clientSocket.getOutputStream(), true);

            // Send a message to the client
            out.println("Hello, Client!");

        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        } finally {
            // Close the resources
            try {
                if (out != null) out.close();
                if (clientSocket != null) clientSocket.close();
                if (serverSocket != null) serverSocket.close();
            } catch (IOException e) {
                System.err.println("IOException while closing resources: " + e.getMessage());
            }
        }
    }
}
