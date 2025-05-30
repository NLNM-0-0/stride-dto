package com.stride.tracking.dto.route.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RouteResponse {
    private String id;
    private String sportId;
    private String userId;
    private String name;
    private Double avgTime;
    private Double avgDistance;
    private String mapImage;
    private List<String> images;
    private List<String> districts;
    private String geometry;
    private LocationResponse location;
    private Integer heat = 0;

}
