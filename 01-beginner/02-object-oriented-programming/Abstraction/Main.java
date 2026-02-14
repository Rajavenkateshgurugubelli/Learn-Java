package oop.abstraction;

/**
 * Module 02: Abstraction
 * Topic: Testing Abstraction
 * 
 * Objectives:
 * 1. Cannot instantiate abstract classes directly.
 * 2. Use interfaces and abstract classes as variable types.
 */
public class Main {

    public static void main(String[] args) {

        // Shape myShape = new Shape("Red"); // Compile Error! Cannot instantiate
        // abstract class.

        // Use the Abstract Class reference
        Shape circle = new Circle("Blue", 5.0);

        circle.displayColor(); // From Shape
        System.out.println("Area: " + String.format("%.2f", circle.calculateArea())); // From Circle
        circle.draw(); // From Drawable (via Circle)

        // Use the Interface reference
        Drawable d = new Circle("Green", 2.0);
        d.draw(); // Only 'draw' method is accessible via this reference (unless casted)
    }
}
