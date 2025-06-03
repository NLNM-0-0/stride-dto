package com.stride.tracking.metric.dto.report.response;

import com.stride.tracking.metric.dto.report.response.sportmaptype.SportMapTypeByDateEntryReport;
import com.stride.tracking.metric.dto.report.response.user.UserReport;
import com.stride.tracking.metric.dto.report.response.activity.ActivityReport;
import com.stride.tracking.metric.dto.report.response.sport.SportReport;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetReportResponse {
    private ActivityReport activity;
    private SportReport sportReport;
    private UserReport userReport;
    private List<SportMapTypeByDateEntryReport> sportMapTypes;
}
