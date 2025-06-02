package com.stride.tracking.core.dto.supabase.request;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FindDistrictsNearPointRequest {

    @NotNull(message = "Latitude must not be null")
    @Min(value = -90, message = "Latitude must be greater or equal to -90")
    @Max(value = 90, message = "Latitude must be less or equal to 90")
    private Double lat;

    @NotNull(message = "Longitude must not be null")
    @Min(value = -180, message = "Longitude must be greater or equal to -180")
    @Max(value = 180, message = "Longitude must be less or equal to 180")
    private Double lon;

    @PositiveOrZero(message = "Around must be zero or positive")
    private int around;
}
