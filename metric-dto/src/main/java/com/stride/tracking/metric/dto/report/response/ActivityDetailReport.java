package com.stride.tracking.metric.dto.report.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ActivityDetailReport {
    private String id;
    private String sportId;
    private long time;
    private long elevationGain;
    private long distance;
}
