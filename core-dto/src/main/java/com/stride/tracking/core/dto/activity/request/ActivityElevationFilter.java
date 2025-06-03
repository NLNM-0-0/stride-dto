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
public class ActivityElevationFilter {

    @NotNull(message = "Min elevation is required")
    @Min(value = 0, message = "Min elevation must be >= 0")
    private Integer min;

    @NotNull(message = "Max elevation is required")
    @Min(value = 0, message = "Max elevation must be >= 0")
    private Integer max;

    @AssertTrue(message = "Min elevation must be less than or equal to max elevation")
    public boolean isValidRange() {
        return min <= max;
    }
}
