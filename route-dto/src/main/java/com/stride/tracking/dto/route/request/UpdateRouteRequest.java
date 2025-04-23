package com.stride.tracking.dto.route.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UpdateRouteRequest {
    private String activityId;
    private double avgTime;
    private List<String> images;
}
