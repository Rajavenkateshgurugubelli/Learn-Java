package concurrency;

import java.time.Duration;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

/**
 * Module 06: Concurrency
 * Topic: Virtual Threads (Java 21)
 * 
 * Objectives:
 * 1. Create Virtual Threads.
 * 2. Understand high throughput for blocking tasks.
 */
public class VirtualThreads {

    public static void main(String[] args) {

        // --- 1. Creating a Virtual Thread ---
        Thread.startVirtualThread(() -> {
            System.out.println("Virtual Thread Running: " + Thread.currentThread());
        });

        // --- 2. Executor for Virtual Threads ---
        // Try launching 10,000 threads!
        // With Platform threads (OS threads), this would crash or be slow.
        // With Virtual threads, it's instant.

        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            IntStream.range(0, 10_000).forEach(i -> {
                executor.submit(() -> {
                    try {
                        Thread.sleep(Duration.ofMillis(10)); // Blocking operation
                    } catch (InterruptedException e) {
                    }
                    // Task done
                });
            });
        } // Executor auto-closes and waits for tasks

        System.out.println("Finished 10,000 tasks!");
    }
}
