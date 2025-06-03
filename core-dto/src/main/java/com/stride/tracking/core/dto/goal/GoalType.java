package com.stride.tracking.core.dto.goal;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum GoalType {
    ACTIVITY(false),
    DISTANCE(false),
    TIME(true),
    ELEVATION(true),
    ;

    private final boolean isRequiredMap;
}
