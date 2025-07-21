import Area.Rectangle;
import Area.Circle;
import Area.Square;

public class AreaDemo {
    public static void main(String[] args) {
        // Rectangle example
        double length = 5;
        double width = 3;
        Rectangle.displayArea(length, width);
        
        // Circle example
        double radius = 4.0;
        Circle.displayArea(radius);
        
        // Square example
        double side = 6.5;
        Square.displayArea(side);
    }
}