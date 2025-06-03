package com.stride.tracking.metric.dto.report.response.sport;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SportReport {
    private Integer numberSports;
    private List<SportMapTypeDetailReport> sportMapTypes;
    private List<SportDetailReport> sports;
}
