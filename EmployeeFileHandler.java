import java.io.*;
import java.util.Scanner;

public class EmployeeFileHandler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get employee details from user
        System.out.println("Enter Employee Details:");
        System.out.print("Employee ID: ");
        String empId = scanner.nextLine();
        
        System.out.print("Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Address: ");
        String address = scanner.nextLine();
        
        System.out.print("Date of Birth (DD/MM/YYYY): ");
        String dob = scanner.nextLine();
        
        System.out.print("Phone Number: ");
        String phone = scanner.nextLine();
        
        // Write to file
        try (PrintWriter writer = new PrintWriter(new FileWriter("Emp.txt", true))) {
            writer.println("Employee ID: " + empId);
            writer.println("Name: " + name);
            writer.println("Address: " + address);
            writer.println("Date of Birth: " + dob);
            writer.println("Phone Number: " + phone);
            writer.println("-----------------------------");
            System.out.println("\nEmployee details saved to Emp.txt");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
        
        // Read and display file contents
        System.out.println("\nContents of Emp.txt:");
        try (BufferedReader reader = new BufferedReader(new FileReader("Emp.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        
        scanner.close();
    }
}