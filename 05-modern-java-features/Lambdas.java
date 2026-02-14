package modern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Module 05: Modern Java
 * Topic: Lambda Expressions
 * 
 * Objectives:
 * 1. Syntax: (parameters) -> expression
 * 2. Implementing @FunctionalInterface (interfaces with one abstract method).
 */
public class Lambdas {

    public static void main(String[] args) {

        // --- 1. The Old Way (Anonymous Inner Class) ---
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Old Way: Running...");
            }
        };
        new Thread(r1).start();

        // --- 2. The New Way (Lambda) ---
        // (params) -> body
        Runnable r2 = () -> System.out.println("New Way: Running...");
        new Thread(r2).start();

        // --- 3. Sorting with Comparator ---
        List<String> names = new ArrayList<>();
        names.add("Charlie");
        names.add("Alice");
        names.add("Bob");

        // Old Way
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });

        // Lambda Way
        // Type inference: Compiler knows s1 and s2 are Strings
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));

        // Method Reference (Even cleaner!)
        Collections.sort(names, String::compareTo);

        System.out.println("Sorted: " + names);
    }
}
