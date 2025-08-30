import java.io.*;
import java.net.*;

public class CircleServer {
    public static void main(String[] args) {
        try {
            // Create server socket on port 5000
            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("Server started. Waiting for client...");

            // Accept client connection
            Socket socket = serverSocket.accept();
            System.out.println("Client connected.");

            // Input and Output streams
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // Read radius from client
            String radiusStr = in.readLine();
            double radius = Double.parseDouble(radiusStr);

            // Compute area
            double area = Math.PI * radius * radius;

            // Send result back to client
            out.println(area);

            // Close connections
            socket.close();
            serverSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
