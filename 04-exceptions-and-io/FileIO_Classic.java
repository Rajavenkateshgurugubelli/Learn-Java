package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Module 04: File I/O
 * Topic: Classic I/O (java.io)
 * 
 * Objectives:
 * 1. Write text to a file using FileWriter/BufferedWriter.
 * 2. Read text from a file using FileReader/BufferedReader.
 * 3. Handle IOExceptions.
 */
public class FileIO_Classic {

    public static void main(String[] args) {
        String filename = "classic_example.txt";

        // --- Writing to File ---
        // Try-with-resources: Automatically closes the writer (Java 7+)
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write("Hello from Classic I/O!");
            writer.newLine(); // Platform independent line separator
            writer.write("This file was created using BufferedWriter.");
            System.out.println("File written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // --- Reading from File ---
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            System.out.println("\nReading file content:");
            String line;
            // Read line by line until null
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
