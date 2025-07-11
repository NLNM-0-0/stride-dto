package com.stride.tracking.metric.dto.traininglog.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TrainingLogMetadata {
    private Date from;
    private Date to;
}
