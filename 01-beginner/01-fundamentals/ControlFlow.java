package fundamentals;

import java.util.Scanner;

/**
 * Module 01: Fundamentals
 * Topic: Control Flow
 * 
 * Objectives:
 * 1. Conditional Statements (if-else, switch).
 * 2. Modern Switch Expressions (Java 12+).
 * 3. Loops (for, while, do-while).
 * 4. Break and Continue.
 */
public class ControlFlow {

    public static void main(String[] args) {
        
        // --- 1. If-Else ---
        int score = 85;
        char grade;
        
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else {
            grade = 'F';
        }
        System.out.println("Score: " + score + ", Grade: " + grade);
        
        // --- 2. Switch (Classic vs Modern) ---
        // Classic Switch
        String day = "Monday";
        switch (day) {
            case "Monday":
                System.out.println("Start of the work week.");
                break;
            case "Friday":
                System.out.println("Weekend is near!");
                break;
            default:
                System.out.println("Mid-week blues.");
        }
        
        // Modern Switch Expression (Java 12+) - returns a value, no break needed!
        String typeOfDay = switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "Weekday";
            case "Saturday", "Sunday" -> "Weekend";
            default -> "Invalid Day";
        };
        System.out.println(day + " is a " + typeOfDay);

        // --- 3. Loops ---
        
        // For Loop (Output: 1 2 3 4 5)
        System.out.print("For Loop: ");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        // Enhanced For-Loop (For-Each) - Great for Arrays/Collections
        int[] numbers = {10, 20, 30};
        System.out.print("For-Each: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // While Loop (Check condition, then execute)
        int count = 0;
        System.out.print("While Loop: ");
        while (count < 3) {
            System.out.print("Hi ");
            count++;
        }
        System.out.println();
        
        // Do-While Loop (Execute once, then check condition)
        // Guaranteed to run at least once.
        int doCount = 0;
        System.out.print("Do-While: ");
        do {
            System.out.print("Run ");
            doCount++;
        } while (doCount < 0); // Condition is false, but ran once!
        System.out.println();
    }
}
