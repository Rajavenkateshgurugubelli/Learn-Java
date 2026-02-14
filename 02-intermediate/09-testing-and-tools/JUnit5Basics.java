package testing;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Module 09: Testing
 * Topic: JUnit 5 Basics
 * 
 * Objectives:
 * 1. @Test: Marks a method as a test case.
 * 2. @BeforeEach: Runs before EVERY test.
 * 3. @AfterEach: Runs after EVERY test.
 */
public class JUnit5Basics {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        System.out.println("Setting up...");
        calculator = new Calculator();
    }

    @AfterEach
    void tearDown() {
        System.out.println("Cleaning up...");
    }

    @Test
    void testAddition() {
        System.out.println("Testing Addition");
        int result = calculator.add(2, 3);
        assertEquals(5, result, "2 + 3 should equal 5");
    }

    @Test
    void testSubtraction() {
        System.out.println("Testing Subtraction");
        int result = calculator.subtract(5, 3);
        assertEquals(2, result);
    }
}

// Simple class to test
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}
