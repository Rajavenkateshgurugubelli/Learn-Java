package oop.records;

/**
 * Module 02: Records
 * Topic: Using Records
 */
public class Main {

    public static void main(String[] args) {

        // --- Creating a Record ---
        Person p1 = new Person("Alice", 30);

        // --- Accessing Fields (No 'get' prefix needed) ---
        System.out.println("Name: " + p1.name());
        System.out.println("Age: " + p1.age());

        // --- Built-in toString() ---
        System.out.println("Record: " + p1); // Output: Person[name=Alice, age=30]

        // --- Equality ---
        Person p2 = new Person("Alice", 30);
        System.out.println("Are they equal? " + p1.equals(p2)); // true (checks value, not reference)

        // --- Immutability ---
        // p1.age = 31; // Error! Records are immutable.

        // --- Custom Methods ---
        System.out.println("Is adult? " + p1.isAdult());
    }
}
