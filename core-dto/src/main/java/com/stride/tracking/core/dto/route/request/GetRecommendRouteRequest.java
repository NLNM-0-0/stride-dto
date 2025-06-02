package com.stride.tracking.core.dto.route.request;

import com.stride.tracking.core.dto.sport.SportMapType;
import jakarta.validation.constraints.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetRecommendRouteRequest {

    @NotBlank(message = "Sport ID must not be blank")
    private String sportId;

    @NotNull(message = "Latitude must not be null")
    @DecimalMin(value = "-90.0", message = "Latitude must be greater than or equal to -90.0")
    @DecimalMax(value = "90.0", message = "Latitude must be less than or equal to 90.0")
    private Double latitude;

    @NotNull(message = "Longitude must not be null")
    @DecimalMin(value = "-180.0", message = "Longitude must be greater than or equal to -180.0")
    @DecimalMax(value = "180.0", message = "Longitude must be less than or equal to 180.0")
    private Double longitude;

    @NotNull(message = "Sport map type must not be null")
    private SportMapType sportMapType;

    @Min(value = 1, message = "Limit must be at least 1")
    private int limit;
}