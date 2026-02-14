package oop.keywords;

/**
 * Module 02: Keywords
 * Topic: Testing static and final
 */
public class Main {

    public static void main(String[] args) {

        // --- Static ---
        System.out.println("--- Static ---");
        StaticExample.printMessage(); // Calling method on Class directly

        StaticExample obj1 = new StaticExample();
        StaticExample obj2 = new StaticExample();

        obj1.displayCounts(); // Instance: 1, Shared: 2
        obj2.displayCounts(); // Instance: 1, Shared: 2 (Shared count incremented twice)

        // --- Final ---
        System.out.println("\n--- Final ---");
        System.out.println("Max Value Constant: " + FinalExample.MAX_VALUE);
        // FinalExample.MAX_VALUE = 50; // Compile Error
    }
}
