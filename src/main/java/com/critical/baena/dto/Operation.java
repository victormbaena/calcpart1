package com.critical.baena.dto;

public enum Operation {
    add("add"), avg("avg"), multiplication("multiplication"), division("division");

    @SuppressWarnings({"FieldCanBeLocal", "unused"})
    private final String operationType;

    Operation(String operationType){
        this.operationType = operationType;
    }

}
