package com.critical.baena.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AverageTest {

    private Average average;

    /**
     * Sets up the test fixture. (Called before every test case method.)
     */
    @Before
    public void setUp() {
        average = new Average();
    }

    @Test
    public void operationAverageTest() {
        assertEquals(2.2, average.operation(2.2, 2.2), 0);
    }

    @Test
    public void operationAverageTestWithNegativeNumbers() {
        assertEquals(1.1, average.operation(-2.2, 4.4), 0);
    }

}