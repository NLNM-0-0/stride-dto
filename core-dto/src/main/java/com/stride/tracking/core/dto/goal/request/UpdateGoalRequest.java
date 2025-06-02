package com.stride.tracking.core.dto.goal.request;

import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateGoalRequest {

    @PositiveOrZero(message = "Amount must be zero or positive")
    private Long amount;

    private Boolean active;
}
