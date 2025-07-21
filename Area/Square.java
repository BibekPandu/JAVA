package Area;

public class Square {
    public static double calculateArea(double side) {
        return side * side;
    }
    
    public static void displayArea(double side) {
        double area = calculateArea(side);
        System.out.printf("Area of square (side=%.2f) = %.2f\n", side, area);
    }
}