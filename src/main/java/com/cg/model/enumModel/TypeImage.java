package com.cg.model.enumModel;

public enum TypeImage {
    USER("User"), POST("Post");

    private final String value;

    TypeImage(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public static TypeImage fromValue(String value) {
        TypeImage[] status = values();
        for (TypeImage c : status) {
            if (c.value.equalsIgnoreCase(value)) {
                return c;
            }
        }
        throw new IllegalArgumentException("Invalid account status value: " + value);
    }
}

