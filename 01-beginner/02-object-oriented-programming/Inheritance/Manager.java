package oop.inheritance;

/**
 * Module 02: Inheritance
 * Topic: Subclass (Child Class)
 * 
 * Objectives:
 * 1. Use 'extends' keyword.
 * 2. Use 'super' to call parent constructor.
 * 3. Add new functionality specific to the subclass.
 */
public class Manager extends Employee {

    private String department;

    // --- Constructor ---
    public Manager(String name, double salary, String department) {
        // Must call parent constructor first!
        super(name, salary);
        this.department = department;
    }

    // --- New Method (Specific to Manager) ---
    public void holdMeeting() {
        System.out.println(name + " is holding a meeting in " + department + ".");
    }

    // --- Method Overriding (Modifying parent behavior) ---
    // The @Override annotation is good practice (checks for errors).
    @Override
    public void work() {
        System.out.println(name + " is managing the team.");
    }
}
