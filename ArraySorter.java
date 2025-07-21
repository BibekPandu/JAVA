import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class ArraySorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input array size
        System.out.print("Enter number of elements (n): ");
        int n = scanner.nextInt();
        
        // Input array elements
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Sort in ascending order (using Arrays.sort())
        int[] ascendingArr = arr.clone();
        Arrays.sort(ascendingArr);
        System.out.println("\nAscending Order (Built-in): " + Arrays.toString(ascendingArr));
        
        // Sort in descending order (manual method)
        int[] descendingArr = arr.clone();
        bubbleSortDescending(descendingArr);
        System.out.println("Descending Order (Manual): " + Arrays.toString(descendingArr));
        
        // Alternative: Descending using Collections.reverseOrder()
        Integer[] integerArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(integerArr, Collections.reverseOrder());
        System.out.println("Descending Order (Built-in): " + Arrays.toString(integerArr));
        
        scanner.close();
    }
    
    // Manual bubble sort for descending order
    public static void bubbleSortDescending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] < arr[j+1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}