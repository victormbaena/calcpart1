/*
 * Copyright (c) 2018.  All rights reserved.
 *
 * Project: appsite
 *
 * File:  TimeJsonObj.java are part of project: appsite
 *
 * Created by Victor M. Baena on 1/9/2018.
 */

package com.critical.baena.dto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * appsite
 * <p>
 * Created by Victor M. Baena on 01/09/2018.
 */
public abstract class TimeJsonObj {

    public String getNow() {
        return LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME);
    }
}
