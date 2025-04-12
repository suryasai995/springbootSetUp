package com.springlean.springlearn.enums;

public enum StudentGradEnum {
    TEN(10),
    ELEVEN(11),
    TWELVE(12);

    private final int value;

    StudentGradEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
