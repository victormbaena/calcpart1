/*
 * Copyright (c) 2018.  All rights reserved.
 *
 * Project: appsite
 *
 * File:  CalcJsonObj.java are part of project: appsite
 *
 * Created by Victor M. Baena on 1/9/2018.
 */

package com.critical.baena.dto;

public class CalcJsonObj extends TimeJsonObj{

    private double value1;

    private double value2;

    private Operation operation;

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

    public Operation getOperation() {
        return operation;
    }

    @SuppressWarnings("unused")
    public void setOperation( Operation operation) {
        this.operation = operation;
    }

    @Override
    public String toString() {
        return "Super {" + super.getNow() + "} CalcJsonObj{" + "value1=" + value1 + ", value2=" + value2 + ", Operation: " + operation + '}';
    }
}
