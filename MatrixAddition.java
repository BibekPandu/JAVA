import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input dimensions for matrix 1
        System.out.println("Enter dimensions for Matrix 1:");
        System.out.print("Rows: ");
        int rows1 = scanner.nextInt();
        System.out.print("Columns: ");
        int cols1 = scanner.nextInt();
        
        // Input dimensions for matrix 2
        System.out.println("\nEnter dimensions for Matrix 2:");
        System.out.print("Rows: ");
        int rows2 = scanner.nextInt();
        System.out.print("Columns: ");
        int cols2 = scanner.nextInt();
        
        // Verify dimensions match
        if (rows1 != rows2 || cols1 != cols2) {
            System.out.println("\nError: Matrix dimensions must match for addition!");
            return;
        }
        
        // Initialize matrices
        int[][] matrix1 = new int[rows1][cols1];
        int[][] matrix2 = new int[rows2][cols2];
        int[][] sumMatrix = new int[rows1][cols1];
        
        // Input elements for matrix 1
        System.out.println("\nEnter elements for Matrix 1:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                System.out.printf("Element [%d][%d]: ", i, j);
                matrix1[i][j] = scanner.nextInt();
            }
        }
        
        // Input elements for matrix 2
        System.out.println("\nEnter elements for Matrix 2:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.printf("Element [%d][%d]: ", i, j);
                matrix2[i][j] = scanner.nextInt();
            }
        }
        
        // Calculate sum
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        
        // Display results
        System.out.println("\nMatrix 1:");
        printMatrix(matrix1);
        
        System.out.println("\nMatrix 2:");
        printMatrix(matrix2);
        
        System.out.println("\nSum of Matrices:");
        printMatrix(sumMatrix);
        
        scanner.close();
    }
    
    // Helper method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }
}