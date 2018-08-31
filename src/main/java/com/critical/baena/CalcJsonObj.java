package com.critical.baena;

public class CalcJsonObj {

    private double value1;
    private double value2;
    private String operation;

    public double getValue1() {
        return value1;
    }

    public void setValue1(double value1) {
        this.value1 = value1;
    }

    public double getValue2() {
        return value2;
    }

    public void setValue2(double value2) {
        this.value2 = value2;
    }

    @Override
    public String toString() {
        return "CalcJsonObj{" +
                "value1=" + value1 +
                ", value2=" + value2 +
                '}';
    }
}
