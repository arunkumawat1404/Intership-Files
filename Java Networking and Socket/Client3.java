import java.io.*;
import java.net.*;

public class Client3 {
    public static void main(String[] args) {
        Socket socket = null;
        BufferedReader in = null;
        PrintWriter out = null;
        BufferedReader stdIn = null;

        try {
            // Connect to the server on localhost at port 12345
            socket = new Socket("localhost", 12345);
            System.out.println("Connected to the server.");

            // Create a PrintWriter object to send messages to the server
            out = new PrintWriter(socket.getOutputStream(), true);

            // Create a BufferedReader object to read messages from the server
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // Create a BufferedReader object to read messages from the user input
            stdIn = new BufferedReader(new InputStreamReader(System.in));

            // Read from the user input and send to the server
            String userInput;
            while ((userInput = stdIn.readLine()) != null) {
                out.println(userInput);
                System.out.println("Message from server: " + in.readLine());
            }

        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        } finally {
            // Close the resources
            try {
                if (in != null) in.close();
                if (out != null) out.close();
                if (stdIn != null) stdIn.close();
                if (socket != null) socket.close();
            } catch (IOException e) {
                System.err.println("IOException while closing resources: " + e.getMessage());
            }
        }
    }
}

