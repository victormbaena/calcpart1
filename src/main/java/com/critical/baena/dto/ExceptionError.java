/*
 * Copyright (c) 2018.  All rights reserved.
 *
 * Project: appsite
 *
 * File:  ExceptionError.java are part of project: appsite
 *
 * Created by Victor M. Baena on 1/9/2018.
 */

package com.critical.baena.dto;

public class ExceptionError extends TimeJsonObj {

    private final String message;

    public ExceptionError(final String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Super {" + super.getNow() + "} ExceptionError{" +
                "message='" + message + '\'' +
                '}';
    }
}
