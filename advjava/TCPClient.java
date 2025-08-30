import java.io.*;
import java.net.*;

public class TCPClient {
    public static void main(String[] args) {
        try {
            // Connect to server
            Socket socket = new Socket("localhost", 6000);
            System.out.println("Connected to TCP Server.");

            // Input/output streams
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // Send message
            out.println("Hello Server, this is TCP Client!");

            // Receive reply
            String reply = in.readLine();
            System.out.println("Server says: " + reply);

            // Close
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
