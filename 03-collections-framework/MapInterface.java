package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Module 03: Collections
 * Topic: Map Interface
 * 
 * Objectives:
 * 1. Key-Value pairs.
 * 2. Keys must be unique.
 * 3. HashMap vs TreeMap.
 */
public class MapInterface {

    public static void main(String[] args) {

        // --- HashMap ---
        // Key: ID (Integer), Value: Name (String)
        Map<Integer, String> students = new HashMap<>();

        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Charlie");
        students.put(101, "Alice Updated"); // Overwrites value for key 101

        System.out.println("--- HashMap ---");
        System.out.println("Student 101: " + students.get(101));

        // Iterating
        System.out.println("All Students:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // --- TreeMap ---
        // Sorted by Key
        Map<String, Integer> scores = new TreeMap<>();
        scores.put("Zack", 90);
        scores.put("Adam", 85);

        System.out.println("\n--- TreeMap (Sorted by Key) ---");
        System.out.println(scores); // {Adam=85, Zack=90}
    }
}
