package fundamentals;

import java.util.Arrays;

/**
 * Module 01: Fundamentals
 * Topic: Arrays
 * 
 * Objectives:
 * 1. Declaring and Initializing Arrays.
 * 2. Accessing elements by index.
 * 3. Iterating over arrays.
 * 4. Common Array operations (sorting, toString).
 */
public class ArraysBasic {

    public static void main(String[] args) {
        
        // --- 1. Declaration ---
        // Option A: Declare size first
        int[] scores = new int[5]; // Creates an array of size 5 (indices 0-4), defaults to 0
        
        // Option B: Initialize with values
        String[] fruits = {"Apple", "Banana", "Cherry"};
        
        // --- 2. Assignment & Access ---
        scores[0] = 95;
        scores[1] = 88;
        
        System.out.println("First fruit: " + fruits[0]);
        System.out.println("Second score: " + scores[1]);
        
        // --- 3. Iterating ---
        System.out.print("All Fruits: ");
        for (int i = 0; i < fruits.length; i++) {
            System.out.print(fruits[i] + (i < fruits.length - 1 ? ", " : ""));
        }
        System.out.println();
        
        // --- 4. Utilities (java.util.Arrays) ---
        // Printing an array directly gives a memory reference (e.g., [I@1b6d3586)
        // Use Arrays.toString() for readable output.
        System.out.println("Scores Array: " + Arrays.toString(scores));
        
        // Sorting
        int[] randomNums = {5, 2, 9, 1, 6};
        Arrays.sort(randomNums);
        System.out.println("Sorted: " + Arrays.toString(randomNums));
        
        // Multidimensional Arrays (2D Grid)
        int[][] grid = {
            {1, 2, 3},
            {4, 5, 6}
        };
        System.out.println("Element at Row 1, Col 2: " + grid[1][2]); // Output: 6
    }
}
