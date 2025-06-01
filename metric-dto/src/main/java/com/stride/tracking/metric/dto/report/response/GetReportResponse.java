package com.stride.tracking.metric.dto.report.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetReportResponse {
    private ActivityReport activity;
    private SportReport sportReport;
    private UserReport userReport;
}
