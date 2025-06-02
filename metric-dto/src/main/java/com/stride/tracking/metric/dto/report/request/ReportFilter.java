package com.stride.tracking.metric.dto.report.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReportFilter {

    @NotNull(message = "fromDate must not be null")
    private Long fromDate;

    @NotNull(message = "toDate must not be null")
    private Long toDate;
}
