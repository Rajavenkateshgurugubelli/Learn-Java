package modern.exercises;

import java.util.ArrayList;
import java.util.List;

/**
 * Module 05: Exercise
 * 
 * Challenge: Student Filter
 * 
 * 1. Create a Student class (name, score).
 * 2. Create a List of Students.
 * 3. Use Streams to:
 * - Filter students with score > 75.
 * - Sort them by score descending.
 * - Map them to just their names.
 * - Print the names.
 */
public class Exercise05 {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 85));
        students.add(new Student("Bob", 60));
        students.add(new Student("Charlie", 90));

        // TODO: Implement stream pipeline here
    }
}

class Student {
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}
