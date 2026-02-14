package oop.abstraction;

/**
 * Module 02: Abstraction
 * Topic: Abstract Class
 * 
 * Objectives:
 * 1. Define an abstract class using 'abstract' keyword.
 * 2. Define abstract methods (forces subclasses to implement).
 * 3. Can have non-abstract methods too.
 */
public abstract class Shape implements Drawable {

    String color;

    public Shape(String color) {
        this.color = color;
    }

    // Abstract Method: No body. Must be implemented by concrete subclasses.
    public abstract double calculateArea();

    // Concrete Method: Shared behavior.
    public void displayColor() {
        System.out.println("Shape Color: " + color);
    }
}
