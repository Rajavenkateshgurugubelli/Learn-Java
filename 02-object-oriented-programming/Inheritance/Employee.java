package oop.inheritance;

/**
 * Module 02: Inheritance
 * Topic: Base Class (Superclass)
 * 
 * Objectives:
 * 1. Create a class that can be extended.
 * 2. Use 'protected' access modifier (accessible to subclasses).
 */
public class Employee {

    // Protected members are accessible in subclasses and the same package.
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void work() {
        System.out.println(name + " is working...");
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }
}
