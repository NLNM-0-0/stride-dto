package com.stride.tracking.metric.dto.progress;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ProgressCountType {
    DAILY(1),
    WEEKLY(7),
    ;

    private final int countDays;
}
