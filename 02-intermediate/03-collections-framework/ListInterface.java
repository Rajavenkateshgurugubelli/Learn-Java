package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Module 03: Collections
 * Topic: List Interface
 * 
 * Objectives:
 * 1. ArrayList: Resizable array. Good for accessing elements.
 * 2. LinkedList: Doubly-linked list. Good for adding/removing.
 */
public class ListInterface {

    public static void main(String[] args) {

        // --- ArrayList ---
        // Best for random access (get(i) is O(1))
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Alice"); // Duplicates allowed

        System.out.println("--- ArrayList ---");
        System.out.println(names);

        names.remove("Bob");
        System.out.println("After removing Bob: " + names);
        System.out.println("Element at index 0: " + names.get(0));

        // --- LinkedList ---
        // Best for frequent insertions/deletions (O(1))
        List<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(0, 5); // Insert at beginning

        System.out.println("\n--- LinkedList ---");
        System.out.print("Looping: ");
        for (Integer num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
