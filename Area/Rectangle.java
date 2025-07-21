package Area;

public class Rectangle {
    public static double calculateArea(double length, double width) {
        return length * width;
    }
    
    public static void displayArea(double length, double width) {
        double area = calculateArea(length, width);
        System.out.printf("Area of rectangle (length=%.2f, width=%.2f) = %.2f\n", length, width, area);
    }
}