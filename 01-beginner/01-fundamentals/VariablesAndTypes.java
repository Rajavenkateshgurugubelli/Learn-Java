// package fundamentals; // Commented out for easier compilation

/**
 * Module 01: Fundamentals
 * Topic: Variables and Data Types
 * 
 * Objectives:
 * 1. Understand Primitive Types (int, double, boolean, char).
 * 2. Understand Reference Types (String).
 * 3. Learn variable declaration and initialization.
 * 4. Introduction to 'var' (local variable type inference).
 */
public class VariablesAndTypes {

    public static void main(String[] args) {
        // --- 1. Primitive Types ---
        // Primitives store simple values directly in memory (stack).

        // Integer types
        int age = 25; // Standard integer (32-bit)
        long population = 8_000_000_000L; // Large integer (64-bit), note the 'L' suffix
        byte smallNum = 127; // Very small integer (8-bit, -128 to 127)
        short mediumNum = 32000; // Small integer (16-bit)

        // Floating-point types
        double price = 19.99; // Standard decimal (64-bit precision)
        float pi = 3.14159f; // Smaller decimal (32-bit), note the 'f' suffix

        // Characters (single quotes)
        char grade = 'A';
        char specialChar = '\u00A9'; // Unicode for copyright symbol ©

        // Boolean (true/false)
        boolean isJavaFun = true;
        boolean isCold = false;

        System.out.println("--- Primitives ---");
        System.out.println("Age: " + age);
        System.out.println("Population: " + population);
        System.out.println("Price: " + price);
        System.out.println("Grade: " + grade);
        System.out.println("Is Java Fun? " + isJavaFun);

        // --- 2. Reference Types ---
        // Reference types store the memory address (reference) of an object (in the
        // heap).

        String message = "Hello, Java!"; // String is a class, not a primitive (double quotes)
        String name = new String("Developer"); // Explicit object creation (less common for Strings)

        System.out.println("\n--- Reference Types ---");
        System.out.println("Message: " + message);
        System.out.println("Name:Length: " + name.length()); // Calling a method on an object

        // --- 3. Key Differences ---
        // Primitives are compared by value (== checks if values are equal).
        // Objects are compared by reference (== checks if they point to the exact same
        // memory location).

        int x = 10;
        int y = 10;
        System.out.println("\nPrimitives (10 == 10): " + (x == y)); // true

        String s1 = new String("Test");
        String s2 = new String("Test");
        System.out.println("Objects (new String vs new String): " + (s1 == s2)); // false (different addresses)
        System.out.println("Objects (.equals): " + s1.equals(s2)); // true (checks content)

        // --- 4. Modern Java: 'var' (Java 10+) ---
        // The compiler infers the type based on the value on the right side.
        // Rules:
        // - Must be initialized immediately.
        // - Cannot be used for method parameters or return types.
        // - Cannot be null.

        var query = "Select * from users"; // Inferred as String
        var count = 100; // Inferred as int

        System.out.println("\n--- Type Inference ---");
        System.out.println("Query is of type: " + query.getClass().getSimpleName());

        // --- 🧠 TRY IT YOURSELF ---
        // 1. Declare a String variable called 'myName' and assign your name.
        // 2. Declare an int variable called 'myAge' and assign your age.
        // 3. Print a sentence like "I am [myName] and I am [myAge] years old."
        // 4. Create two double variables, multiply them, and print the result.
    }
}
