package oop.polymorphism;

/**
 * Module 02: Polymorphism
 * Topic: Dynamic Binding
 * 
 * Objectives:
 * 1. Understand Runtime Polymorphism (Method Overriding).
 * 2. Use a parent reference to hold child objects.
 */
public class Main {

    public static void main(String[] args) {

        // --- Without Polymorphism ---
        Animal genericAnimal = new Animal();
        Dog myDog = new Dog();
        Cat myCat = new Cat();

        System.out.println("--- Static Binding (Sort of) ---");
        genericAnimal.makeSound();
        myDog.makeSound();
        myCat.makeSound();

        // --- With Polymorphism (The Power!) ---
        System.out.println("\n--- Dynamic Binding (Polymorphism) ---");

        // Parent Reference = Child Object
        Animal shapeShifter;

        shapeShifter = new Dog();
        shapeShifter.makeSound(); // JVM decides at runtime to call Dog's version

        shapeShifter = new Cat();
        shapeShifter.makeSound(); // JVM calls Cat's version

        // --- Practical Example: Array of Animals ---
        System.out.println("\n--- Iterate through a Zoo ---");
        // We can treat them all as just 'Animal'
        Animal[] zoo = { new Dog(), new Cat(), new Animal(), new Dog() };

        for (Animal animal : zoo) {
            animal.makeSound(); // Valid, regardless of the actual type
        }
    }
}
