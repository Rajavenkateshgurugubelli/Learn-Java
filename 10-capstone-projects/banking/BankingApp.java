package capstone.banking;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Capstone 1: Console Banking App
 * 
 * Objectives:
 * - Use OOP (Account class).
 * - Use Collections (HashMap for storing accounts).
 * - Handle Exceptions (Invalid amounts, Insufficient funds).
 */
public class BankingApp {

    private static Map<String, Account> accounts = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Banking App ---");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> createAccount();
                case 2 -> performTransaction("DEPOSIT");
                case 3 -> performTransaction("WITHDRAW");
                case 4 -> checkBalance();
                case 5 -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid option.");
            }
        }
    }

    private static void createAccount() {
        System.out.print("Enter Account ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        if (accounts.containsKey(id)) {
            System.out.println("Error: Account ID already exists.");
        } else {
            accounts.put(id, new Account(id, name));
            System.out.println("Account created successfully.");
        }
    }

    private static void performTransaction(String type) {
        System.out.print("Enter Account ID: ");
        String id = scanner.nextLine();
        Account acc = accounts.get(id);

        if (acc == null) {
            System.out.println("Error: Account not found.");
            return;
        }

        System.out.print("Enter Amount: ");
        double amount = scanner.nextDouble();

        try {
            if (type.equals("DEPOSIT")) {
                acc.deposit(amount);
            } else {
                acc.withdraw(amount);
            }
            System.out.println("Transaction successful. New Balance: " + acc.getBalance());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void checkBalance() {
        System.out.print("Enter Account ID: ");
        String id = scanner.nextLine();
        Account acc = accounts.get(id);

        if (acc != null) {
            System.out.println("Balance for " + acc.getName() + ": " + acc.getBalance());
        } else {
            System.out.println("Error: Account not found.");
        }
    }
}

class Account {
    private String id;
    private String name;
    private double balance;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount <= 0)
            throw new IllegalArgumentException("Amount must be positive.");
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0)
            throw new IllegalArgumentException("Amount must be positive.");
        if (amount > balance)
            throw new IllegalArgumentException("Insufficient funds.");
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }
}
