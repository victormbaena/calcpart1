package com.critical.baena.calculator;

public class Add implements ICalculator {
    @Override
    public double operation(double value1, double value2) {
        return value1 + value2;
    }
}
