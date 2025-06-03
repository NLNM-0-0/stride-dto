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
public class ActivityTimeFilter {

    @NotNull(message = "Min time is required")
    @Min(value = 0, message = "Min time must be >= 0")
    private Integer min;

    @NotNull(message = "Max time is required")
    @Min(value = 0, message = "Max time must be >= 0")
    private Integer max;

    @AssertTrue(message = "Min time must be less than or equal to max time")
    public boolean isValidRange() {
        return min <= max;
    }
}
