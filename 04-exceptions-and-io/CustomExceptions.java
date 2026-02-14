package exceptions;

/**
 * Module 04: Exceptions
 * Topic: Custom Exception
 * 
 * Objectives:
 * 1. Create a user-defined exception by extending Exception (Checked) or
 * RuntimeException (Unchecked).
 */
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomExceptions {

    public static void main(String[] args) {
        try {
            registerUser("Alice", 15);
        } catch (InvalidAgeException e) {
            System.out.println("Registration Failed: " + e.getMessage());
        }
    }

    public static void registerUser(String name, int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("User must be 18 or older.");
        }
        System.out.println("User " + name + " registered successfully.");
    }
}
