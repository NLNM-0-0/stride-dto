package com.stride.tracking.core.dto.activity.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.AssertTrue;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ActivityDistanceFilter {

    @NotNull(message = "Min distance is required")
    @Min(value = 0, message = "Min distance must be >= 0")
    private Integer min;

    @NotNull(message = "Max distance is required")
    @Min(value = 0, message = "Max distance must be >= 0")
    private Integer max;

    @AssertTrue(message = "Min distance must be less than or equal to max distance")
    public boolean isValidRange() {
        return min <= max;
    }
}