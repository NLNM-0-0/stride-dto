package com.stride.tracking.metric.dto.report.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReportFilter {
    private Long fromDate;
    private Long toDate;
}
