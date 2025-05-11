package com.stride.tracking.dto.activity.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CoordinateRequest {
    private double[] coordinate;
    private long timestamp;
}
