class Box {
    private double length;
    private double breadth;
    private double height;
    
    // Default constructor
    public Box() {
        this.length = 0;
        this.breadth = 0;
        this.height = 0;
    }
    
    // Parameterized constructor
    public Box(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
    
    // Method to compute volume
    public double getVolume() {
        return length * breadth * height;
    }
}

class BoxWeight extends Box {
    private double weight;
    
    // Default constructor
    public BoxWeight() {
        super();  // Calls Box's default constructor
        this.weight = 0;
    }
    
    // Parameterized constructor
    public BoxWeight(double length, double breadth, double height, double weight) {
        super(length, breadth, height);  // Calls Box's parameterized constructor
        this.weight = weight;
    }
    
    // Method to get weight
    public double getWeight() {
        return weight;
    }
}

public class BoxDemo {
    public static void main(String[] args) {
        // Create two BoxWeight objects
        BoxWeight box1 = new BoxWeight(10, 5, 3, 2.5);
        BoxWeight box2 = new BoxWeight(6, 6, 6, 4.2);
        
        // Display volume and weight of both boxes
        System.out.println("Box 1:");
        System.out.println("Volume: " + box1.getVolume());
        System.out.println("Weight: " + box1.getWeight() + " kg");
        
        System.out.println("\nBox 2:");
        System.out.println("Volume: " + box2.getVolume());
        System.out.println("Weight: " + box2.getWeight() + " kg");
    }
}