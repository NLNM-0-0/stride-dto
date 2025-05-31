package com.stride.tracking.dto.route.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ActivityMetricEvent {
    private String activityId;

    private LocalDateTime time;

    private String userId;
    private String sportId;
    private long movingTimeSeconds;
    private int elevationGain;
    private String location;
}
