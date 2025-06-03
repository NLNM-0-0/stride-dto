package com.stride.tracking.metric.dto.sport;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SportMapType {
    DRIVING("driving", 10, 1000, 100),
    WALKING("walking", 1, 100, 50),
    CYCLING("cycling", 10, 1000, 100),
    NO_MAP(null, 0, 0, 0);

    private final String lowercase;
    private final int recordMeters;
    private final int recommendedDistance;
    private final int minDistance;
}
