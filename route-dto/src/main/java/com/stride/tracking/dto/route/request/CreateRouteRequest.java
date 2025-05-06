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
public class CreateRouteRequest {
    private String sportId;
    private String activityId;
    private String sportMapType;
    private Double avgTime;
    private Double avgDistance;
    private List<String> images;
    private String geometry;
    private String ward;
    private String district;
    private String city;
}
