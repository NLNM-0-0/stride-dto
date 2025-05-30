package com.stride.tracking.dto.route.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateRouteRequest {
    private String activityId;
    private Double avgTime;
    private Double avgDistance;
    private List<String> images;
}
