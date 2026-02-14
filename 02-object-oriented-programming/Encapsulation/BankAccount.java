package oop.encapsulation;

/**
 * Module 02: Encapsulation
 * Topic: Hiding Data
 * 
 * Objectives:
 * 1. Understand Access Modifiers (private, public).
 * 2. Use Getters (Accessors) and Setters (Mutators).
 * 3. Validate data in setters (Data Integrity).
 */
public class BankAccount {

    // --- Private Fields ---
    // These variables cannot be accessed directly from outside this class.
    // This protects them from invalid modifications.
    private String accountHolder;
    private double balance;
    private int accountNumber;

    // --- Constructor ---
    public BankAccount(String accountHolder, double initialBalance, int accountNumber) {
        this.accountHolder = accountHolder;
        // We can use the setter in the constructor to enforce rules immediately!
        setBalance(initialBalance);
        this.accountNumber = accountNumber;
    }

    // --- Getters and Setters ---

    // Getter for accountHolder
    public String getAccountHolder() {
        return accountHolder;
    }

    // Setter for accountHolder
    public void setAccountHolder(String accountHolder) {
        if (accountHolder != null && !accountHolder.isEmpty()) {
            this.accountHolder = accountHolder;
        } else {
            System.out.println("Error: Name cannot be empty.");
        }
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for balance (with validation logic)
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Error: Balance cannot be negative.");
        }
    }

    // We might not want a setter for accountNumber (Read-only after creation)
    public int getAccountNumber() {
        return accountNumber;
    }

    // --- Business Logic Methods ---
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
}
