package modern;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Module 05: Modern Java
 * Topic: Streams API
 * 
 * Objectives:
 * 1. Create a Stream.
 * 2. Intermediate Operations (filter, map, sorted).
 * 3. Terminal Operations (collect, forEach, reduce).
 */
public class StreamsAPI {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Edward");

        System.out.println("Original: " + names);

        // --- Stream Pipeline ---
        // 1. Filter: Names starting with 'A' or 'E' (Vowels?)
        // 2. Map: Convert to Uppercase
        // 3. Sorted: Reverse order
        // 4. Collect: Gather into a new List

        List<String> result = names.stream()
                .filter(name -> name.startsWith("A") || name.startsWith("E"))
                .map(String::toUpperCase)
                .sorted((a, b) -> b.compareTo(a)) // Reverse sort
                .collect(Collectors.toList()); // or .toList() in Java 16+

        System.out.println("Processed: " + result);

        // --- Numeric Streams ---
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Reduce: Aggregate values (e.g., Sum)
        int sum = numbers.stream()
                .reduce(0, (subtotal, element) -> subtotal + element);
        // .reduce(0, Integer::sum);

        System.out.println("Sum: " + sum);

        // Primitives Stream (IntStream)
        int sumSquares = numbers.stream()
                .mapToInt(n -> n * n)
                .sum();
        System.out.println("Sum of Squares: " + sumSquares);
    }
}
