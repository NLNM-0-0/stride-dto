package com.stride.tracking.metric.dto.event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserMetricEvent {
    private String userId;

    private Instant time;

    private String provider;
}
