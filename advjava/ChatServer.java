import java.io.*;
import java.net.*;

public class ChatServer {
    public static void main(String[] args) {
        try {
            // 1. Create server socket at port 5000
            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("✅ Server started. Waiting for client...");

            // 2. Accept client connection
            Socket socket = serverSocket.accept();
            System.out.println("✅ Client connected!");

            // 3. Setup input/output streams
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // 4. Read and write messages
            BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
            String clientMsg, serverMsg;

            while (true) {
                // Receive from client
                clientMsg = in.readLine();
                if (clientMsg == null || clientMsg.equalsIgnoreCase("exit")) {
                    System.out.println("❌ Client disconnected.");
                    break;
                }
                System.out.println("👤 Client: " + clientMsg);

                // Send to client
                System.out.print("You (Server): ");
                serverMsg = console.readLine();
                out.println(serverMsg);

                if (serverMsg.equalsIgnoreCase("exit")) {
                    System.out.println("❌ Server closing chat.");
                    break;
                }
            }

            // 5. Close everything
            in.close();
            out.close();
            socket.close();
            serverSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
