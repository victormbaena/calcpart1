/*
 * Copyright (c) 2018.  All rights reserved.
 *
 * Project: appsite
 *
 * File:  MultiplicationTest.java are part of project: appsite
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
public class MultiplicationTest {

    private Multiplication multiplication;

    /**
     * Sets up the test fixture. (Called before every test case method.)
     */
    @Before
    public void setUp() {
        multiplication = new Multiplication();
    }

    @Test
    public void operationMultiplicationTest() {
        assertEquals(4.84, multiplication.operation(2.20, 2.20), 0.000000000000001);
    }

    @Test
    public void operationMultiplicationWithNegativeNumbersTest() {
        assertEquals(-4.84, multiplication.operation(-2.2, 2.2), 0.000000000000001);
    }

}