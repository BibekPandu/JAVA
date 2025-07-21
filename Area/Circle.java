package Area;

public class Circle {
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
    
    public static void displayArea(double radius) {
        double area = calculateArea(radius);
        System.out.printf("Area of circle (radius=%.2f) = %.2f\n", radius, area);
    }
}