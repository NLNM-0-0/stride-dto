package com.stride.tracking.dto.route.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ActivityMetricEvent {
    private String activityId;

    private Instant time;

    private String userId;
    private String sportId;
    private double movingTimeSeconds;
    private double elevationGain;
    private double distance;
    private String location;
}
