import java.io.*;
import java.util.Scanner;

public class StudentRecordHandler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get student details from user
        System.out.println("Enter Student Details:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        System.out.print("Grade: ");
        String grade = scanner.nextLine();
        
        System.out.print("Contact Number: ");
        String contact = scanner.nextLine();
        
        // Write to std.txt
        try (PrintWriter writer = new PrintWriter(new FileWriter("std.txt"))) {
            writer.println("Name: " + name);
            writer.println("Age: " + age);
            writer.println("Grade: " + grade);
            writer.println("Contact Number: " + contact);
            System.out.println("\nStudent record saved to std.txt");
        } catch (IOException e) {
            System.out.println("Error writing to std.txt: " + e.getMessage());
            return;
        }
        
        // Copy std.txt to std1.txt
        try (BufferedReader reader = new BufferedReader(new FileReader("std.txt"));
             PrintWriter writer = new PrintWriter(new FileWriter("std1.txt"))) {
            
            String line;
            while ((line = reader.readLine()) != null) {
                writer.println(line);
            }
            System.out.println("Content copied from std.txt to std1.txt");
        } catch (IOException e) {
            System.out.println("Error copying file: " + e.getMessage());
            return;
        }
        
        // Display content of std1.txt
        System.out.println("\nContents of std1.txt:");
        try (BufferedReader reader = new BufferedReader(new FileReader("std1.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading std1.txt: " + e.getMessage());
        }
        
        scanner.close();
    }
}