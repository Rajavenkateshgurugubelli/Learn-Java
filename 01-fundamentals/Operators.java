package fundamentals;

/**
 * Module 01: Fundamentals
 * Topic: Operators
 * 
 * Objectives:
 * 1. Arithmetic Operators (+, -, *, /, %, ++, --)
 * 2. Relational (Comparison) Operators (==, !=, >, <, >=, <=)
 * 3. Logical Operators (&&, ||, !)
 * 4. Assignment Operators (=, +=, -=, etc.)
 */
public class Operators {

    public static void main(String[] args) {
        
        // --- 1. Arithmetic Operators ---
        int a = 10;
        int b = 3;
        
        System.out.println("--- Arithmetic ---");
        System.out.println("Addition (10 + 3): " + (a + b));
        System.out.println("Subtraction (10 - 3): " + (a - b));
        System.out.println("Multiplication (10 * 3): " + (a * b));
        System.out.println("Division (10 / 3): " + (a / b)); // Integer division (truncates decimal)
        System.out.println("Modulus (10 % 3): " + (a % b)); // Remainder (1)

        // Increment/Decrement
        int count = 0;
        count++; // Post-increment (count becomes 1)
        System.out.println("Count after ++: " + count);
        
        // --- 2. Relational Operators ---
        // Used to compare two values. Returns a boolean.
        System.out.println("\n--- Relational ---");
        System.out.println("Is 10 equal to 3? " + (a == b));
        System.out.println("Is 10 not equal to 3? " + (a != b));
        System.out.println("Is 10 greater than 3? " + (a > b));

        // --- 3. Logical Operators ---
        // Used to combine boolean expressions.
        boolean hasLicense = true;
        boolean hasCar = false;
        
        System.out.println("\n--- Logical ---");
        // AND (&&): Both must be true
        System.out.println("Ready to drive (License AND Car)? " + (hasLicense && hasCar));
        
        // OR (||): At least one must be true
        // In this case, maybe they can borrow a car or drive? (Just an example)
        System.out.println("Can transport (License OR Car)? " + (hasLicense || hasCar));
        
        // NOT (!): Reverses the boolean
        System.out.println("Does NOT have car? " + (!hasCar));

        // --- 4. Assignment Operators ---
        System.out.println("\n--- Assignment ---");
        int savings = 100;
        savings += 50; // Equivalent to: savings = savings + 50;
        System.out.println("Savings after depositing 50: " + savings);
        
        savings -= 20; // savings = savings - 20;
        System.out.println("Savings after withdrawing 20: " + savings);
    }
}
