import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int originalNumber = number;
        int sum = 0;
        
        // Calculate sum of digits
        while (number != 0) {
            int digit = number % 10;  // Get last digit
            sum += digit;            // Add digit to sum
            number /= 10;            // Remove last digit
        }
        
        System.out.println("Sum of digits of " + originalNumber + " is: " + sum);
        
        scanner.close();
    }
}