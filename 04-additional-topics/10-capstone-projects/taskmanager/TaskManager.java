package capstone.taskmanager;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Capstone 2: File-Based Task Manager
 * 
 * Objectives:
 * - Use IO (NIO) to persist data.
 * - Simple parsing (CSV format: id,description,isDone).
 */
public class TaskManager {

    private static final String FILE_NAME = "tasks.csv";
    private static final Path PATH = Paths.get(FILE_NAME);
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ensureFileExists();

        while (true) {
            System.out.println("\n--- Task Manager ---");
            System.out.println("1. Add Task");
            System.out.println("2. List Tasks");
            System.out.println("3. Exit");
            System.out.print("> ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1" -> addTask();
                case "2" -> listTasks();
                case "3" -> {
                    return;
                }
                default -> System.out.println("Invalid option.");
            }
        }
    }

    private static void ensureFileExists() {
        if (!Files.exists(PATH)) {
            try {
                Files.createFile(PATH);
            } catch (IOException e) {
                System.out.println("Could not initialize storage file.");
            }
        }
    }

    private static void addTask() {
        System.out.print("Enter task description: ");
        String desc = scanner.nextLine();
        // Simple CSV format: Description
        try {
            Files.writeString(PATH, desc + "\n", StandardOpenOption.APPEND);
            System.out.println("Task added.");
        } catch (IOException e) {
            System.out.println("Error saving task.");
        }
    }

    private static void listTasks() {
        try {
            List<String> lines = Files.readAllLines(PATH);
            System.out.println("\n--- Your Tasks ---");
            if (lines.isEmpty()) {
                System.out.println("(No tasks found)");
            } else {
                for (int i = 0; i < lines.size(); i++) {
                    System.out.println((i + 1) + ". " + lines.get(i));
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading tasks.");
        }
    }
}
