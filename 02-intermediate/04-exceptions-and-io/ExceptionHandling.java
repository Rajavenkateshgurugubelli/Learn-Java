package exceptions;

import java.util.Scanner;

/**
 * Module 04: Exceptions
 * Topic: Try-Catch-Finally
 * 
 * Objectives:
 * 1. Handle exceptions to prevent crashes.
 * 2. Use 'finally' block for cleanup.
 * 3. Use 'throw' to manually trigger an exception.
 */
public class ExceptionHandling {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number to divide 100 by: ");
            String input = scanner.nextLine();
            int divisor = Integer.parseInt(input); // Might throw NumberFormatException

            if (divisor == 0) {
                throw new ArithmeticException("Cannot divide by zero (Manual check).");
            }

            int result = 100 / divisor; // Might throw ArithmeticException
            System.out.println("Result: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Error: That wasn't a valid integer!");
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Something else went wrong.");
        } finally {
            System.out.println("Finally block: Always runs (good for closing resources).");
            scanner.close();
        }

        System.out.println("Program continues...");
    }
}
