package fundamentals;

/**
 * Module 01: Fundamentals
 * Topic: Methods
 * 
 * Objectives:
 * 1. Defining methods (access modifier, return type, name, parameters).
 * 2. Calling methods.
 * 3. Method overloading (same name, different parameters).
 * 4. Variable Scope (Local vs Class level).
 */
public class Methods {

    public static void main(String[] args) {
        // Calling a static method directly
        greet("Alice");
        
        int sum = add(5, 10);
        System.out.println("Sum of 5 and 10: " + sum);
        
        // Method Overloading
        System.out.println("Sum of 5.5 and 2.5: " + add(5.5, 2.5));
        System.out.println("Sum of 1, 2, 3: " + add(1, 2, 3));
    }

    /**
     * A simple void method (does not return anything).
     * @param name The name to greet.
     */
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    /**
     * A method that returns an integer.
     * @param a First number
     * @param b Second number
     * @return The sum of a and b
     */
    public static int add(int a, int b) {
        return a + b;
    }

    // --- Overloading ---
    
    // Same method name 'add', but different parameter types (double)
    public static double add(double a, double b) {
        return a + b;
    }

    // Same method name 'add', but different number of parameters
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
}
