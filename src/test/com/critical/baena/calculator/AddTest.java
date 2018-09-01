package com.critical.baena.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AddTest {

    private Add add;

    /**
     * Sets up the test fixture. (Called before every test case method.)
     */
    @Before
    public void setUp() {
        add = new Add();
    }

    @Test
    public void operationAddTest() {
        assertEquals(5.4, add.operation(2.3, 3.1), 0);
    }

    @Test
    public void operationTestWithNegativeNumbers() {
        assertEquals(0.8, add.operation(-2.3, 3.1), 0.0000000000000003);
    }
}