package com.stride.tracking.core.dto.activity.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.AssertTrue;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ActivityDateFilter {

    @NotNull(message = "Min date (timestamp) is required")
    @PositiveOrZero(message = "Min date must be a positive timestamp")
    private Long min;

    @NotNull(message = "Max date (timestamp) is required")
    @PositiveOrZero(message = "Max date must be a positive timestamp")
    private Long max;

    @AssertTrue(message = "Min date must be less than or equal to max date")
    public boolean isValidRange() {
        return min <= max;
    }
}