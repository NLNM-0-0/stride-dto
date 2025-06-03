package com.stride.tracking.core.dto.sport;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SportMapType {
    DRIVING("driving", 10, 1000),
    WALKING("walking", 1, 100),
    CYCLING("cycling", 10, 1000),
    NO_MAP(null, 0, 0);

    private final String lowercase;
    private final int recordMeters;
    private final int recommendedDistance;
}
