package collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Module 03: Collections
 * Topic: Queue and Deque
 * 
 * Objectives:
 * 1. PriorityQueue: Process elements based on priority (natural order).
 * 2. ArrayDeque: Double-ended queue (can be Stack or Queue).
 */
public class QueueAndDeque {

    public static void main(String[] args) {

        // --- PriorityQueue ---
        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(50);
        pq.add(10);
        pq.add(30);

        System.out.println("--- PriorityQueue ---");
        // peek() looks at the head (smallest element)
        System.out.println("Head (peek): " + pq.peek()); // 10

        // poll() removes the head
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " "); // 10 30 50 (Sorted order retrieval)
        }
        System.out.println();

        // --- ArrayDeque (Stack) ---
        // LIFO (Last-In-First-Out)
        Deque<String> stack = new ArrayDeque<>();
        stack.push("First");
        stack.push("Second");
        stack.push("Third");

        System.out.println("\n--- ArrayDeque (Stack Behavior) ---");
        System.out.println("Pop: " + stack.pop()); // Third
        System.out.println("Pop: " + stack.pop()); // Second
    }
}
