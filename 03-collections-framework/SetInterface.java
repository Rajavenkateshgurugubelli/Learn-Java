package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Module 03: Collections
 * Topic: Set Interface
 * 
 * Objectives:
 * 1. HashSet: Unique elements, no guaranteed order.
 * 2. LinkedHashSet: Unique elements, insertion order preserved.
 * 3. TreeSet: Unique elements, sorted (natural order).
 */
public class SetInterface {

    public static void main(String[] args) {

        // --- HashSet ---
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Java");
        hashSet.add("Python");
        hashSet.add("C++");
        hashSet.add("Java"); // Duplicate ignored

        System.out.println("--- HashSet (Unordered) ---");
        System.out.println(hashSet);

        // --- LinkedHashSet ---
        Set<String> linkedSet = new LinkedHashSet<>();
        linkedSet.add("Java");
        linkedSet.add("Python");
        linkedSet.add("C++");

        System.out.println("\n--- LinkedHashSet (Insertion Order) ---");
        System.out.println(linkedSet);

        // --- TreeSet ---
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Zebra");
        treeSet.add("Apple");
        treeSet.add("Monkey");

        System.out.println("\n--- TreeSet (Sorted) ---");
        System.out.println(treeSet); // Output: [Apple, Monkey, Zebra]
    }
}
