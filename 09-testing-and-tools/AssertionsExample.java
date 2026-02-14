package testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Module 09: Testing
 * Topic: Assertions
 * 
 * Objectives:
 * 1. assertEquals(expected, actual)
 * 2. assertTrue(condition) / assertFalse(condition)
 * 3. assertNull(object) / assertNotNull(object)
 * 4. assertThrows(Exception.class, lambda)
 */
public class AssertionsExample {

    @Test
    void testStandardAssertions() {
        assertEquals(4, 2 + 2);
        assertTrue(5 > 3, "5 is greater than 3");
        assertNotNull(new String("Hello"));
    }

    @Test
    void testException() {
        // We expect this code to throw an ArithmeticException
        assertThrows(ArithmeticException.class, () -> {
            int x = 1 / 0;
        });
    }
}
