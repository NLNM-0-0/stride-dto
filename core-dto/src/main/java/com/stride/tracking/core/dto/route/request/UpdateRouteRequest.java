package com.stride.tracking.core.dto.route.request;

import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
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

    @Size(min = 1, message = "Activity ID must not be empty")
    private String activityId;

    @PositiveOrZero(message = "Average time must be zero or positive")
    private Double avgTime;

    @PositiveOrZero(message = "Average distance must be zero or positive")
    private Double avgDistance;

    private List<String> images;
}
