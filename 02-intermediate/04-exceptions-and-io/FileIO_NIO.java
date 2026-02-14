package io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Module 04: File I/O
 * Topic: NIO (New I/O - java.nio)
 * 
 * Objectives:
 * 1. Use 'Path' and 'Paths' to represents file locations.
 * 2. Use 'Files' utility class for reading/writing.
 * 3. Much simpler syntax for small files.
 */
public class FileIO_NIO {

    public static void main(String[] args) {
        Path filePath = Paths.get("nio_example.txt");
        String content = """
                Hello from NIO!
                This is utilizing Java 15 Text Blocks.
                Writing files has never been easier.
                """;

        // --- Writing ---
        try {
            // Write string directly to file
            Files.writeString(filePath, content);
            System.out.println("File written: " + filePath.toAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        // --- Reading ---
        try {
            System.out.println("\nReading file content:");
            // Read all lines into a List
            List<String> lines = Files.readAllLines(filePath);
            lines.forEach(System.out::println);

            // Or read entirely as one String
            // String allContent = Files.readString(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
