package com.stride.tracking.dto.sport;

public enum SportMapType {
    DRIVING("driving"),
    WALKING("walking"),
    CYCLING("cycling");

    private final String lowercase;

    SportMapType(String lowercase) {
        this.lowercase = lowercase;
    }

    public String getLowercase() {
        return lowercase;
    }
}
