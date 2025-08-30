import java.io.*;
import java.net.*;

public class ChatClient {
    public static void main(String[] args) {
        try {
            // 1. Connect to server (localhost:5000)
            Socket socket = new Socket("localhost", 5000);
            System.out.println("✅ Connected to server!");

            // 2. Setup input/output streams
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // 3. Console for user input
            BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
            String serverMsg, clientMsg;

            while (true) {
                // Send to server
                System.out.print("You (Client): ");
                clientMsg = console.readLine();
                out.println(clientMsg);

                if (clientMsg.equalsIgnoreCase("exit")) {
                    System.out.println("❌ Client closing chat.");
                    break;
                }

                // Receive from server
                serverMsg = in.readLine();
                if (serverMsg == null || serverMsg.equalsIgnoreCase("exit")) {
                    System.out.println("❌ Server disconnected.");
                    break;
                }
                System.out.println("👨‍💻 Server: " + serverMsg);
            }

            // 4. Close everything
            in.close();
            out.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
