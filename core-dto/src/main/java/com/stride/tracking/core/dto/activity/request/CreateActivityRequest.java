package com.stride.tracking.core.dto.activity.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateActivityRequest {
    private String sportId;
    private String routeId;
    private String name;
    private String description;
    private Long movingTimeSeconds;
    private Long elapsedTimeSeconds;
    private List<CoordinateRequest> coordinates;
    private List<Integer> heartRates;
    private List<String> images;
    private int rpe;
}
