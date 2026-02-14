package advanced;

/**
 * Module 07: Advanced Concepts
 * Topic: Garbage Collection (GC)
 * 
 * Documentation Only.
 * 
 * 1. What is GC?
 * The process by which Java automatically frees memory that is no longer used
 * (objects with no references pointing to them).
 * 
 * 2. Heap vs Stack
 * - Stack: Stores method calls and local variables (primitives and references).
 * - Heap: Stores actual objects. GC works here.
 * 
 * 3. How it works (Generational Hypothesis)
 * - Most objects die young.
 * - Eden Space: New objects are created here.
 * - Survivor Spaces (S0, S1): Objects that survive a minor GC move here.
 * - Old (Tenured) Gen: Objects that survive many GCs move here.
 * 
 * 4. Triggering GC
 * System.gc(); // Suggests the JVM to run GC, but no guarantee.
 * 
 * 5. GC Algorithms
 * - Serial GC: Simple, uses one thread (STW - Stop The World).
 * - Parallel GC: Uses multiple threads for minor GCs.
 * - G1 GC (Garbage First): Splits heap into regions, default in modern Java.
 * - ZGC: Low latency, scalable (Java 15+).
 */
public class GarbageCollection {
    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();

        System.out.println("Total Memory: " + runtime.totalMemory() / (1024 * 1024) + " MB");
        System.out.println("Free Memory: " + runtime.freeMemory() / (1024 * 1024) + " MB");

        // Creating garbage
        for (int i = 0; i < 1_000_000; i++) {
            new String("Garbage " + i);
        }

        System.out.println("Free Memory (Before GC): " + runtime.freeMemory() / (1024 * 1024) + " MB");

        System.gc(); // Request GC

        System.out.println("Free Memory (After GC): " + runtime.freeMemory() / (1024 * 1024) + " MB");
    }
}
