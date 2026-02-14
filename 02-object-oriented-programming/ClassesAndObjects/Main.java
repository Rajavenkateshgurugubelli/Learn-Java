package oop.classesandobjects;

/**
 * Module 02: Classes and Objects
 * Topic: Creating Objects
 * 
 * Objectives:
 * 1. Instantiate objects using the 'new' keyword.
 * 2. Access object fields and methods.
 * 3. Understand multiple instances.
 */
public class Main {

    public static void main(String[] args) {

        // --- 1. Creating Objects (Instantiation) ---
        // ClassName objectName = new Constructor(arguments);
        Car myCar = new Car("Toyota", "Corolla", 2022);
        Car sportsCar = new Car("Ferrari", "488 Spider", 2023);

        // --- 2. Using Objects ---
        System.out.println("--- My Car ---");
        myCar.displayInfo();
        myCar.startEngine();

        System.out.println("\n--- Sports Car ---");
        sportsCar.displayInfo();
        // Each object has its own independent state.
        // Starting sportsCar doesn't affect myCar (which is already running).
        sportsCar.startEngine();
        sportsCar.stopEngine();
    }
}
