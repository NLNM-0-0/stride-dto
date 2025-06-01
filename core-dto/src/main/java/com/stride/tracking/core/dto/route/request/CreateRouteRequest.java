package com.stride.tracking.core.dto.route.request;

import com.stride.tracking.core.dto.sport.SportMapType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateRouteRequest {
    private String sportId;
    private String activityId;
    private SportMapType sportMapType;
    private Double avgTime;
    private Double avgDistance;
    private List<String> images;
    private String geometry;
    private String ward;
    private String district;
    private String city;
}
