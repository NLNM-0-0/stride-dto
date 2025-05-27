package com.stride.tracking.dto.goal;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum GoalTimeFrame {
    WEEKLY(12),
    MONTHLY(6),
    ANNUALLY(1)
    ;

    private final int numberHistories;
}
