import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input dimensions for first matrix
        System.out.println("Enter dimensions for Matrix A (m x n):");
        System.out.print("Rows (m): ");
        int m = scanner.nextInt();
        System.out.print("Columns (n): ");
        int n = scanner.nextInt();
        
        // Input dimensions for second matrix
        System.out.println("\nEnter dimensions for Matrix B (must be n x p):");
        System.out.print("Rows (n): " + n + " (fixed)\n");
        System.out.print("Columns (p): ");
        int p = scanner.nextInt();
        
        // Initialize matrices
        int[][] matrixA = new int[m][n];
        int[][] matrixB = new int[n][p];
        int[][] product = new int[m][p];
        
        // Input elements for matrix A
        System.out.println("\nEnter elements for Matrix A:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Element A[%d][%d]: ", i, j);
                matrixA[i][j] = scanner.nextInt();
            }
        }
        
        // Input elements for matrix B
        System.out.println("\nEnter elements for Matrix B:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++) {
                System.out.printf("Element B[%d][%d]: ", i, j);
                matrixB[i][j] = scanner.nextInt();
            }
        }
        
        // Calculate matrix product
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < n; k++) {
                    product[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        
        // Display results
        System.out.println("\nMatrix A:");
        printMatrix(matrixA);
        
        System.out.println("\nMatrix B:");
        printMatrix(matrixB);
        
        System.out.println("\nProduct Matrix (A × B):");
        printMatrix(product);
        
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