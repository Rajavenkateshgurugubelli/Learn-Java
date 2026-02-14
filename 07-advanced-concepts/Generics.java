package advanced;

import java.util.ArrayList;
import java.util.List;

/**
 * Module 07: Advanced Concepts
 * Topic: Generics
 * 
 * Objectives:
 * 1. Create a Generic Class <T>.
 * 2. Create a Generic Method.
 * 3. Use Bounded Type Parameters (<T extends Number>).
 * 4. Use Wildcards (?).
 */
public class Generics {

    public static void main(String[] args) {

        // --- 1. Generic Class ---
        Box<String> stringBox = new Box<>();
        stringBox.setContent("Hello Generics");
        System.out.println("String Box: " + stringBox.getContent());

        Box<Integer> intBox = new Box<>();
        intBox.setContent(123);
        System.out.println("Int Box: " + intBox.getContent());

        // --- 2. Generic Method ---
        printArray(new Integer[] { 1, 2, 3 });
        printArray(new String[] { "A", "B", "C" });

        // --- 3. Wildcards ---
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        printList(nums); // List<Integer> is a subtype of List<?>
    }

    // Generic Method
    public static <E> void printArray(E[] inputArray) {
        for (E element : inputArray) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // Wildcard Method
    public static void printList(List<?> list) {
        System.out.println("List: " + list);
    }
}

// Generic Class
class Box<T> {
    private T content;

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
}
