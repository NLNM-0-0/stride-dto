package com.stride.tracking.metric.dto.activity.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ActivityCreatedEvent {
    private String activityId;

    private Instant time;

    private String userId;
    private String sportId;
    private String name;
    private long movingTimeSeconds;
    private long elevationGain;
    private long distance;
    private String mapImage;
    private String location;
}
