package com.stride.tracking.metric.dto.traininglog.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TrainingLogFilter {
    private String userId;
    private List<String> sportIds;
    private Long fromDate;
    private Long toDate;
}
