public class ArraySum {
    public static void main(String[] args) {
        // Initialize an array
        int[] numbers = {5, 12, 8, 3, 9, 15};
        
        // Calculate sum
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        
        // Display the result
        System.out.println("The sum of array elements is: " + sum);
    }
}