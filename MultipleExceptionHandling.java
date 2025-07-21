import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter numerator: ");
            int numerator = scanner.nextInt();
            
            System.out.print("Enter denominator: ");
            int denominator = scanner.nextInt();
            
            // Potential division by zero
            int result = divideNumbers(numerator, denominator);
            System.out.println("Division result: " + result);
            
            // Potential array index out of bounds
            int[] numbers = {10, 20, 30};
            System.out.print("Enter array index to access (0-2): ");
            int index = scanner.nextInt();
            System.out.println("Array element: " + numbers[index]);
            
        } 
        // Multi-catch block (Java 7+)
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Multi-catch: Exception occurred - " + e.getClass().getSimpleName());
            System.out.println("Error message: " + e.getMessage());
        }
        // Separate catch for input mismatch
        catch (InputMismatchException e) {
            System.out.println("InputMismatchException: Please enter valid integers!");
        }
        // General catch block (should be last)
        catch (Exception e) {
            System.out.println("Unexpected error occurred: " + e.getMessage());
        }
        // Finally block always executes
        finally {
            System.out.println("\nFinally block executed - cleaning up resources");
            scanner.close();
        }
        
        System.out.println("Program continues after exception handling");
    }
    
    public static int divideNumbers(int a, int b) {
        return a / b;
    }
}