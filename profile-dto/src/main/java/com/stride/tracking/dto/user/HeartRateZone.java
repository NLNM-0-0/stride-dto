package com.stride.tracking.dto.user;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum HeartRateZone {
    ZONE1("1", "Endurance"),
    ZONE2("2", "Moderate"),
    ZONE3("3", "Tempo"),
    ZONE4("4", "Threshold"),
    ZONE5("5", "Anaerobic"),
    ;

    private final String id;
    private final String name;
}
