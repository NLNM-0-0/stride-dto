package com.stride.tracking.metric.dto.report.response.sportmaptype;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SportMapTypeByDateEntryReport {
    private Date from;
    private Date to;
    private List<SportMapTypeByDateEntryReport> values;
}
