package oop.keywords;

/**
 * Module 02: Keywords
 * Topic: final
 * 
 * Objectives:
 * 1. final variable: Value cannot be changed (Constant).
 * 2. final method: Cannot be overridden.
 * 3. final class: Cannot be extended.
 */
public final class FinalExample { // final class

    // Constant: conventionally UPPER_SNAKE_CASE
    public static final double MAX_VALUE = 100.0;

    private final String creationTime;

    public FinalExample() {
        // dynamic initialization allowed in constructor, but only once.
        this.creationTime = "Now";
    }

    public void tryToChange() {
        // MAX_VALUE = 200.0; // Error!
        // creationTime = "Later"; // Error!
    }

    public final void securedMethod() {
        System.out.println("This logic cannot be altered by subclasses (if class wasn't final).");
    }
}
