package concurrency;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * Module 06: Concurrency
 * Topic: CompletableFuture
 * 
 * Objectives:
 * 1. Asynchronous programming (Non-blocking).
 * 2. Chaining tasks (thenApply, thenAccept).
 */
public class CompletableFutureExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        System.out.println("Main Thread: " + Thread.currentThread().getName());

        // Use supplyAsync to run a task in a separate thread (ForkJoinPool)
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000); // Simulate work
            } catch (InterruptedException e) {
            }
            return "Hello";
        });

        // Chain operations (Functional style)
        future.thenApply(s -> s + " World")
                .thenApply(String::toUpperCase)
                .thenAccept(result -> System.out.println("Result: " + result));

        System.out.println("This prints BEFORE result (Async!)");

        // Block main thread just to see output
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
    }
}
