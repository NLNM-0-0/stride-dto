package com.stride.tracking.core.dto.route.request;

import com.stride.tracking.core.dto.sport.SportMapType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
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

    @NotBlank(message = "Sport ID must not be blank")
    private String sportId;

    @NotBlank(message = "Activity ID must not be blank")
    private String activityId;

    @NotNull(message = "Sport map type must not be null")
    private SportMapType sportMapType;

    @NotNull(message = "Average time must not be null")
    @PositiveOrZero(message = "Average time must be zero or positive")
    private Double avgTime;

    @NotNull(message = "Average distance must not be null")
    @PositiveOrZero(message = "Average distance must be zero or positive")
    private Double avgDistance;

    @NotNull(message = "Images list must not be null")
    private List<String> images;

    @NotNull(message = "Geometry must not be null")
    private List<List<Double>> geometry;

    @NotBlank(message = "Ward must not be blank")
    private String ward;

    @NotBlank(message = "District must not be blank")
    private String district;

    @NotBlank(message = "City must not be blank")
    private String city;

    @NotBlank(message = "Map image must not be blank")
    private String mapImage;
}