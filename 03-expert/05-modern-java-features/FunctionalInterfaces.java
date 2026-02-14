package modern;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Module 05: Modern Java
 * Topic: Functional Interfaces
 * 
 * Objectives:
 * 1. Predicate<T>: boolean test(T t)
 * 2. Consumer<T>: void accept(T t)
 * 3. Function<T, R>: R apply(T t)
 * 4. Supplier<T>: T get()
 */
public class FunctionalInterfaces {

    public static void main(String[] args) {

        // --- 1. Predicate (Check a condition) ---
        Predicate<String> isLong = (str) -> str.length() > 5;
        System.out.println("Is 'Hello' long? " + isLong.test("Hello"));
        System.out.println("Is 'Universe' long? " + isLong.test("Universe"));

        // --- 2. Consumer (Perform an action) ---
        Consumer<String> printer = (msg) -> System.out.println("Message: " + msg);
        printer.accept("Lambda Power!");

        // --- 3. Function (Transform input to output) ---
        Function<Integer, String> doublerStr = (num) -> "Double of " + num + " is " + (num * 2);
        System.out.println(doublerStr.apply(10));

        // --- 4. Supplier (Provide a value) ---
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println("Random: " + randomValue.get());
    }
}
