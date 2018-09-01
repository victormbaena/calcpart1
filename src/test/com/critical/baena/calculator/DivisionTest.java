/*
 * Copyright (c) 2018.  All rights reserved.
 *
 * Project: appsite
 *
 * File:  DivisionTest.java are part of project: appsite
 *
 * Created by Victor M. Baena on 1/9/2018.
 */

package com.critical.baena.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * appsite
 * <p>
 * Created by Victor M. Baena on 01/09/2018.
 */
public class DivisionTest {

    private Division division;

    /**
     * Sets up the test fixture. (Called before every test case method.)
     */
    @Before
    public void setUp() {
        division = new Division();
    }

    @Test
    public void operationDivisionTest() {
        assertEquals(1, division.operation(2.00, 2.00), 0);
    }

    @Test
    public void operationDivisionWithFirstNegativeNumbersTest() {
        assertEquals(-1, division.operation(-2.00, 2.00), 0);
    }

    @Test
    public void operationDivisionWithSecondNegativeNumbersTest() {
        assertEquals(-1, division.operation(2.00, -2.00), 0);
    }

    @Test
    public void operationDivisionWithFirstNumberEqualZeroTest() {
        assertEquals(0, division.operation(0.00, -2.00), 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void operationDivisionWithSecondNumberEqualZeroTest() {
        assertEquals(0, division.operation(2.00, 0.00), 0);
    }
}