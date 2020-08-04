package com.omegarobotics.unit6.lessons.enums;

/*
 * Topics:
 * - Enum fields and methods
 */

public enum TrafficLight {
    // enum values
    RED("Please stop"), // invoke constructor
    GREEN("Please go"),
    YELLOW("Please caution"); // semicolon at the end

    private String description;

    // all enum constructors are private, so private keyword is implicit
    TrafficLight(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
