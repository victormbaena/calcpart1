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
import com.critical.baena.calculator.Average;
import com.critical.baena.calculator.Division;
import com.critical.baena.calculator.Multiplication;
import com.critical.baena.dto.CalcJsonObj;

/**
 * appsite
 * <p>
 * Created by Victor M. Baena on 01/09/2018.
 */
@SuppressWarnings("WeakerAccess")
class Calculate {
    private final CalcJsonObj calcJsonObj;

    public Calculate(CalcJsonObj calcJsonObj) {
        this.calcJsonObj = calcJsonObj;
    }

    public double calculateOperation() {
        System.out.println(calcJsonObj.toString());

        switch (calcJsonObj.getOperation()) {
        case add:
            return new Add().operation(calcJsonObj.getValue1(), calcJsonObj.getValue2());
        case avg:
            return new Average().operation(calcJsonObj.getValue1(), calcJsonObj.getValue2());
        case multiplication:
                return new Multiplication().operation(calcJsonObj.getValue1(), calcJsonObj.getValue2());
        case division:
                return new Division().operation(calcJsonObj.getValue1(), calcJsonObj.getValue2());
        }
        return 0;
    }
}
