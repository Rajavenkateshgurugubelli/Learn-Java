package oop.classesandobjects;

/**
 * Module 02: Classes and Objects
 * Topic: Defining a Class
 * 
 * Objectives:
 * 1. Define fields (attributes/state).
 * 2. Define constructors (initialization).
 * 3. Define methods (behavior).
 * 4. Use the 'this' keyword.
 */
public class Car {

    // --- Fields (State) ---
    // These variables store the data for each object.
    String make;
    String model;
    int year;
    boolean isRunning;

    // --- Constructor ---
    // Special method to initialize objects. Name matches class name. No return
    // type.
    public Car(String make, String model, int year) {
        // 'this' refers to the current object instance.
        // It resolves ambiguity between field name and parameter name.
        this.make = make;
        this.model = model;
        this.year = year;
        this.isRunning = false; // Default state
    }

    // --- Methods (Behavior) ---
    public void startEngine() {
        if (!isRunning) {
            isRunning = true;
            System.out.println("The " + make + " " + model + " is starting... Vroom!");
        } else {
            System.out.println("Engine is already on.");
        }
    }

    public void stopEngine() {
        if (isRunning) {
            isRunning = false;
            System.out.println("The " + make + " " + model + " has stopped.");
        } else {
            System.out.println("Engine is already off.");
        }
    }

    public void displayInfo() {
        System.out.println("Car Info: " + year + " " + make + " " + model);
    }
}
