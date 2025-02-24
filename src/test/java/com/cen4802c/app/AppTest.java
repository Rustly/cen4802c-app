package com.cen4802c.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    @DisplayName("Test the main function")
    void recursive_Fibonacci() {
        assertEquals(55, App.recursive_Fibonacci(10));
    }
}
