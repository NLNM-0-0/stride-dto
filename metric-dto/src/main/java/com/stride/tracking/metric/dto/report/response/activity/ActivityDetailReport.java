package com.stride.tracking.metric.dto.report.response.activity;

import com.stride.tracking.metric.dto.report.response.sport.SportDetailReport;
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
    private SportDetailReport sport;
    private long time;
    private long elevationGain;
    private long distance;
    private int calories;
    private double avgHeartRate;
}
