package com.stride.tracking.core.dto.goal.request;

import com.stride.tracking.core.dto.goal.GoalTimeFrame;
import com.stride.tracking.core.dto.goal.GoalType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateGoalRequest {

    @NotBlank(message = "Sport ID must not be blank")
    private String sportId;

    @NotNull(message = "Goal type must not be null")
    private GoalType type;

    @NotNull(message = "Goal time frame must not be null")
    private GoalTimeFrame timeFrame;

    @NotNull(message = "Amount must not be null")
    @Positive(message = "Amount must be positive")
    private Long amount;
}
