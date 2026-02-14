package advanced;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

/**
 * Module 07: Advanced Concepts
 * Topic: Annotations
 * 
 * Objectives:
 * 1. Create a custom annotation @Myinfo.
 * 2. Apply it to a method.
 * 3. Process it using Reflection.
 */

// 1. Define
@Retention(RetentionPolicy.RUNTIME) // Available at runtime
@Target(ElementType.METHOD) // Can be used on methods
@interface MyInfo {
    String author();

    String date();

    int version() default 1;
}

// 2. Apply
class CodeLib {
    @MyInfo(author = "Alice", date = "2023-10-01", version = 2)
    public void featureA() {
        System.out.println("Feature A");
    }

    @MyInfo(author = "Bob", date = "2023-10-05")
    public void featureB() {
        System.out.println("Feature B");
    }
}

// 3. Process
public class Annotations {
    public static void main(String[] args) {
        CodeLib lib = new CodeLib();

        for (Method method : lib.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(MyInfo.class)) {
                MyInfo info = method.getAnnotation(MyInfo.class);
                System.out.println("Method: " + method.getName());
                System.out.println("  Author: " + info.author());
                System.out.println("  Date: " + info.date());
                System.out.println("  Version: " + info.version());
                System.out.println("---------------------------");
            }
        }
    }
}
