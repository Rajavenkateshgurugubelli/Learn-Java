package advanced;

import java.lang.reflect.Method;
import java.lang.reflect.Field;

/**
 * Module 07: Advanced Concepts
 * Topic: Reflection API
 * 
 * Objectives:
 * 1. Inspect class details at runtime.
 * 2. Access private fields (breaking encapsulation!).
 * 3. Invoke methods dynamically.
 */
public class ReflectionAPI {

    public static void main(String[] args) {

        try {
            // Get the Class object
            Class<?> cls = Class.forName("advanced.Secret");
            Object obj = cls.getDeclaredConstructor().newInstance();

            // --- 1. Inspect Methods ---
            System.out.println("Methods:");
            for (Method method : cls.getDeclaredMethods()) {
                System.out.println("- " + method.getName());
            }

            // --- 2. Access Private Field ---
            Field privateField = cls.getDeclaredField("secretCode");
            privateField.setAccessible(true); // The magic key!
            System.out.println("\nOriginal Secret: " + privateField.get(obj));

            privateField.set(obj, "HACKED!");
            System.out.println("Modified Secret: " + privateField.get(obj));

            // --- 3. Invoke Private Method ---
            Method privateMethod = cls.getDeclaredMethod("reveal");
            privateMethod.setAccessible(true);
            privateMethod.invoke(obj);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Secret {
    private String secretCode = "1234";

    private void reveal() {
        System.out.println("The secret is: " + secretCode);
    }
}
