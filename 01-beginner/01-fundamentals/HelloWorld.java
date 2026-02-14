package fundamentals;

/**
 * Module 01: Fundamentals
 * Topic: Hello World
 * 
 * Objectives:
 * 1. Understand the structure of a Java class.
 * 2. Learn about the 'main' method - the entry point of any Java application.
 * 3. Print output to the console.
 */
public class HelloWorld {

    /**
     * The main method is the entry point of a Java application.
     * When you run 'java HelloWorld', the JVM (Java Virtual Machine) looks for this specific method signature.
     * 
     * @param args Command-line arguments passed to the program (array of Strings).
     */
    public static void main(String[] args) {
        // System.out is the standard output stream (usually your terminal/console).
        // println() is a method that prints a line of text followed by a new line character.
        System.out.println("Hello, World!");

        // You can also use print() which does not add a new line at the end.
        System.out.print("This is printed ");
        System.out.print("on the same line.");
        
        // Printing a blank line for separation
        System.out.println(); 
        
        System.out.println("Welcome to the Java Mastery Path!");
    }
}
