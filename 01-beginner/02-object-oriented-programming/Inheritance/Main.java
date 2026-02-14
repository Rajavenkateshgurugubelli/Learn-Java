package oop.inheritance;

/**
 * Module 02: Inheritance
 * Topic: Testing Inheritance
 * 
 * Objectives:
 * 1. Create instances of Parent and Child classes.
 * 2. Verify method overriding.
 * 3. Verify access to parent methods.
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("--- Employee ---");
        Employee emp = new Employee("Alice", 50000);
        emp.work(); // "Alice is working..."

        System.out.println("\n--- Manager ---");
        Manager mgr = new Manager("Bob", 80000, "IT");

        // 1. Inherited method
        mgr.displayDetails(); // "Name: Bob..." (Inherited from Employee)

        // 2. Overridden method
        mgr.work(); // "Bob is managing the team."

        // 3. New method
        mgr.holdMeeting(); // "Bob is holding a meeting..."
    }
}
