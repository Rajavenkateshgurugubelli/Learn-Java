package concurrency;

/**
 * Module 06: Concurrency
 * Topic: Synchronization
 * 
 * Objectives:
 * 1. Understand Race Conditions.
 * 2. Use 'synchronized' keyword to ensure thread safety.
 */
class Counter {
    private int count = 0;

    // Without 'synchronized', threads might overlap reading/writing 'count'.
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class Synchronization {

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        // Task: Increment 1000 times
        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        };

        // Create two threads
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        // Wait for both to finish
        t1.join();
        t2.join();

        System.out.println("Final Count: " + counter.getCount());
        // Expected: 2000.
        // If increment() wasn't synchronized, it would be < 2000 (Race Condition).
    }
}
