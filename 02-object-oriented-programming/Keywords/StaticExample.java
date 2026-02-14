package oop.keywords;

/**
 * Module 02: Keywords
 * Topic: static
 * 
 * Objectives:
 * 1. Static variables are shared across all instances.
 * 2. Static methods belong to the class, not an object.
 * 3. Static blocks allow initialization of static variables.
 */
public class StaticExample {

    // Instance variable: Each object has its own copy.
    int instanceCount = 0;

    // Static variable: Shared by ALL objects of this class.
    static int sharedCount = 0;

    public StaticExample() {
        instanceCount++;
        sharedCount++;
    }

    public void displayCounts() {
        System.out.println("Instance Count: " + instanceCount + " | Shared Count: " + sharedCount);
    }

    public static void printMessage() {
        System.out.println("This is a static method. No object needed to call me!");
        // System.out.println(instanceCount); // Error! Cannot access non-static members
        // from static context.
    }
}
