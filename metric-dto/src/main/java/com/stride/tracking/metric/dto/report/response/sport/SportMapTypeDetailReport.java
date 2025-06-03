package com.stride.tracking.metric.dto.report.response.sport;

import com.stride.tracking.metric.dto.sport.SportMapType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SportMapTypeDetailReport {
    private SportMapType type;
    private Integer numberActivities;
}
