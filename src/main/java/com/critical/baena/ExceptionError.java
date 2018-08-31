package com.critical.baena;

public class ExceptionError {
    private String message;

    public ExceptionError(final String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }
}
