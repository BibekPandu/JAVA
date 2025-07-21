class ThreadA implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread A - Even numbers from 50 to 100:");
        for (int i = 50; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("Thread A: " + i);
                try {
                    Thread.sleep(100); // Small delay for better output visualization
                } catch (InterruptedException e) {
                    System.out.println("Thread A interrupted");
                }
            }
        }
    }
}

class ThreadB implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread B - Odd numbers from 100 to 200:");
        for (int i = 100; i <= 200; i++) {
            if (i % 2 != 0) {
                System.out.println("Thread B: " + i);
                try {
                    Thread.sleep(100); // Small delay for better output visualization
                } catch (InterruptedException e) {
                    System.out.println("Thread B interrupted");
                }
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        // Create Runnable objects
        Runnable threadA = new ThreadA();
        Runnable threadB = new ThreadB();
        
        // Create Thread objects
        Thread t1 = new Thread(threadA);
        Thread t2 = new Thread(threadB);
        
        System.out.println("Starting both threads...\n");
        
        // Start the threads
        t1.start();
        t2.start();
        
        try {
            // Wait for both threads to complete
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        
        System.out.println("\nBoth threads have finished execution.");
    }
}