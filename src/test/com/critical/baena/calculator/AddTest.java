package com.critical.baena.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class AddTest {

    @Test
    public void operationAddTest() {
        Add add = new Add();
        assertEquals(5.4, add.operation(2.3, 3.1), 0);
    }


    @Test
    public void operationTestWithNegativeNumbers() {
        Add add = new Add();
        assertEquals(0.8, add.operation(-2.3, 3.1), 0.0000000000000003);
    }
}