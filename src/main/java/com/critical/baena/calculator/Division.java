/*
 * Copyright (c) 2018.  All rights reserved.
 *
 * Project: appsite
 *
 * File:  Division.java are part of project: appsite
 *
 * Created by Victor M. Baena on 1/9/2018.
 */

package com.critical.baena.calculator;

/**
 * appsite
 * <p>
 * Created by Victor M. Baena on 01/09/2018.
 */
public class Division implements ICalculator {
    @Override
    public double operation(double value1, double value2) throws ArithmeticException{
        if (value2 == 0) {
            throw new IllegalArgumentException("Argument 'divisor' is 0");
        }
        return value1 / value2;
    }
}
