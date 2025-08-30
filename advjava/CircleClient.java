import java.io.*;
import java.net.*;

public class CircleClient {
    public static void main(String[] args) {
        try {
            // Connect to server
            Socket socket = new Socket("localhost", 5000);
            System.out.println("Connected to server.");

            // Input and Output streams
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // Send radius to server
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter radius of circle: ");
            String radius = userInput.readLine();
            out.println(radius);

            // Read area from server
            String area = in.readLine();
            System.out.println("Area of circle: " + area);

            // Close connections
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
