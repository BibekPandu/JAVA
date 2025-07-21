import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the length
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        
        // Prompt the user to enter the breadth
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();
        
        // Calculate the area (length × breadth)
        double area = length * breadth;
        
        // Display the result
        System.out.println("The area of the rectangle is: " + area);
        
        // Close the scanner
        scanner.close();
    }
}