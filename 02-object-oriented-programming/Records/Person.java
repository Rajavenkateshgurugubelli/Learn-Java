package oop.records;

/**
 * Module 02: Records
 * Topic: Immutable Data Carriers (Java 14+)
 * 
 * Objectives:
 * 1. Define a Record.
 * 2. Understand implicit features: constructor, getters, equals(), hashCode(),
 * toString().
 * 3. Records are final and immutable.
 */
public record Person(String name, int age) {

    // You can add validation in a "Compact Constructor"
    public Person {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }

    // You can add methods
    public boolean isAdult() {
        return age >= 18;
    }
}
