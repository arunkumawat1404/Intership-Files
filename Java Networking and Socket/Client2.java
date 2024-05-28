import java.io.*;
import java.net.*;

public class Client2 {
    public static void main(String[] args) {
        Socket socket = null;
        BufferedReader in = null;

        try {
            // Connect to the server on localhost at port 12345
            socket = new Socket("localhost", 12345);
            System.out.println("Connected to the server.");

            // Create a BufferedReader object to read the message from the server
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // Read and print the message from the server
            String message = in.readLine();
            System.out.println("Message from server: " + message);

        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        } finally {
            // Close the resources
            try {
                if (in != null) in.close();
                if (socket != null) socket.close();
            } catch (IOException e) {
                System.err.println("IOException while closing resources: " + e.getMessage());
            }
        }
    }
}

