/*
 * Copyright (c) 2018.  All rights reserved.
 *
 * Project: appsite
 *
 * File:  Calculate.java are part of project: appsite
 *
 * Created by Victor M. Baena on 1/9/2018.
 */

package com.critical.baena;

import com.critical.baena.calculator.Add;
import com.critical.baena.dto.CalcJsonObj;

/**
 * appsite
 * <p>
 * Created by Victor M. Baena on 01/09/2018.
 */
public class Calculate {
    CalcJsonObj calcJsonObj;

    public Calculate(CalcJsonObj calcJsonObj) {
        this.calcJsonObj = calcJsonObj;
    }

    public double calculateOperation() {
        System.out.println(calcJsonObj.toString());
        switch (calcJsonObj.getOperation().toUpperCase()) {
        case "ADD":
            return new Add().operation(1.5, 2.5);
        }
        return 0;
    }
}
