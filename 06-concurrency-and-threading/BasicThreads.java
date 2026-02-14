package concurrency;

/**
 * Module 06: Concurrency
 * Topic: Basic Threads
 * 
 * Objectives:
 * 1. Extending Thread class.
 * 2. Implementing Runnable interface (Preferred).
 * 3. Starting threads with start().
 */
public class BasicThreads {

    public static void main(String[] args) {

        // --- 1. Extending Thread ---
        class MyThread extends Thread {
            @Override
            public void run() {
                System.out.println("Thread 1 running: " + Thread.currentThread().getName());
            }
        }

        MyThread t1 = new MyThread();
        t1.start(); // Starts a new call stack. calling run() directly would stay on main thread!

        // --- 2. Implementing Runnable ---
        Runnable task = () -> {
            System.out.println("Thread 2 running: " + Thread.currentThread().getName());
        };

        Thread t2 = new Thread(task);
        t2.start();

        System.out.println("Main thread finished: " + Thread.currentThread().getName());
    }
}
