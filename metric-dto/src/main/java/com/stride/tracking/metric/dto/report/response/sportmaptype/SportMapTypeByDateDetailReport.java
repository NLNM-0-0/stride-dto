package com.stride.tracking.metric.dto.report.response.sportmaptype;

import com.stride.tracking.metric.dto.sport.SportMapType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.EnumMap;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SportMapTypeByDateDetailReport {
    private SportMapType type;
    private Integer numberActivities;
    private Long time;
}
