package oop.encapsulation;

/**
 * Module 02: Encapsulation
 * Topic: Testing Access Control
 * 
 * Objectives:
 * 1. Attempt to access private fields (will fail).
 * 2. Use public methods to interact with the object.
 */
public class Main {

    public static void main(String[] args) {

        BankAccount account = new BankAccount("John Doe", 1000.0, 123456);

        // --- Direct Access Forbidden ---
        // account.balance = -500; // Compile Error! balance is private.

        // --- Access via Methods ---
        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Current Balance: $" + account.getBalance());

        // --- Testing Validation ---
        System.out.println("\n--- Testing Invalid Updates ---");
        // Try to set negative balance
        account.setBalance(-500); // Prints error message, balance remains unchanged.
        System.out.println("Balance after invalid update: $" + account.getBalance());

        // Valid update using business logic method
        account.deposit(250);
        System.out.println("Balance after deposit: $" + account.getBalance());
    }
}
