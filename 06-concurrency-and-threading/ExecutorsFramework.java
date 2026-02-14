package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Module 06: Concurrency
 * Topic: Executors Framework
 * 
 * Objectives:
 * 1. Stop creating Threads manually.
 * 2. Use a Thread Pool to reuse threads.
 * 3. Shutdown the executor.
 */
public class ExecutorsFramework {

    public static void main(String[] args) {

        // Create a pool with 2 threads
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Runnable task1 = () -> {
            System.out.println("Task 1 executed by " + Thread.currentThread().getName());
        };

        Runnable task2 = () -> {
            System.out.println("Task 2 executed by " + Thread.currentThread().getName());
        };

        Runnable task3 = () -> {
            System.out.println("Task 3 executed by " + Thread.currentThread().getName());
        };

        // Submit tasks
        executor.submit(task1);
        executor.submit(task2);
        executor.submit(task3); // Will wait for a thread to become free

        // Important: Shutdown! Otherwise program keeps running.
        executor.shutdown();
    }
}
