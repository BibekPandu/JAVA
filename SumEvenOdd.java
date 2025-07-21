public class SumEvenOdd {
    public static void main(String[] args) {
        int sumEven = 0;
        int sumOdd = 0;
        
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sumEven += i;  // Add to even sum if divisible by 2
            } else {
                sumOdd += i;   // Add to odd sum otherwise
            }
        }
        
        System.out.println("Sum of even numbers from 1 to 100: " + sumEven);
        System.out.println("Sum of odd numbers from 1 to 100: " + sumOdd);
    }
}