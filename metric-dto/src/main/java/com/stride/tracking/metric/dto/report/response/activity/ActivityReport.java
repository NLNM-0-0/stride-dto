package com.stride.tracking.metric.dto.report.response.activity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ActivityReport {
    public static final int MAX_RECENT_ACTIVITIES = 10;

    private Double totalTime;
    private Double totalDistance;
    private Double totalElevationGain;
    private Integer numberActivity;
    private Integer numberUsers;
    private List<ActivityDetailReport> recentActivities;
}
