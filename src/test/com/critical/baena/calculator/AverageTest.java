package com.critical.baena.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class AverageTest {

    @Test
    public void operationAverageTest() {
        Average average = new Average();
        assertEquals(2.2, average.operation(2.2, 2.2),0);
    }

    @Test
    public void operationAverageTestWithNegativeNumbers() {
        Average average = new Average();
        assertEquals(1.1, average.operation(-2.2, 4.4),0);
    }

}