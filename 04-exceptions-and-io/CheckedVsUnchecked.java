package exceptions;

import java.io.FileReader;
import java.io.IOException;

/**
 * Module 04: Exceptions
 * Topic: Checked vs Unchecked
 * 
 * Objectives:
 * 1. Unchecked (Runtime): Compiler doesn't complain. Usually logic errors.
 * 2. Checked: Compiler demands handling (try-catch or throws). External issues.
 */
public class CheckedVsUnchecked {

    public static void main(String[] args) {

        // --- Unchecked Exception (RuntimeException) ---
        // Compiler ignores this, but it will crash at runtime.
        int[] nums = { 1, 2, 3 };
        // System.out.println(nums[5]); // ArrayIndexOutOfBoundsException

        // --- Checked Exception ---
        // Compiler Error: "Unhandled exception type IOException" if strictly not
        // handled.
        try {
            readFile("nonexistent.txt");
        } catch (IOException e) {
            System.out.println("Caught checked exception: " + e.getMessage());
        }
    }

    // Declares that this method MIGHT fail with an IOException.
    public static void readFile(String filename) throws IOException {
        FileReader reader = new FileReader(filename); // Constructor throws FileNotFoundException (subclass of
                                                      // IOException)
        reader.close();
    }
}
