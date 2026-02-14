package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Module 03: Collections
 * Topic: Sorting
 * 
 * Objectives:
 * 1. Use Collections.sort().
 * 2. Implement Comparable (natural ordering).
 * 3. Use Comparator (custom ordering).
 */
class Student implements Comparable<Student> {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + "(" + age + ")";
    }

    // Natural ordering by age
    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.age, other.age);
    }
}

public class SortingAndComparable {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Bob", 22));
        students.add(new Student("Alice", 20));
        students.add(new Student("Charlie", 25));

        System.out.println("Original: " + students);

        // --- Comparable (Natural Order) ---
        Collections.sort(students);
        System.out.println("Sorted by Age: " + students);

        // --- Comparator (Custom Order) ---
        // Sort by Name using Lambda
        Collections.sort(students, (s1, s2) -> s1.name.compareTo(s2.name));
        System.out.println("Sorted by Name: " + students);

        // Sort by Age Descending
        students.sort(Comparator.comparingInt((Student s) -> s.age).reversed());
        System.out.println("Age Descending: " + students);
    }
}
