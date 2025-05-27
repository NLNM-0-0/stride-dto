package com.stride.tracking.dto.goal.response;

import com.stride.tracking.dto.goal.GoalTimeFrame;
import com.stride.tracking.dto.goal.GoalType;
import com.stride.tracking.dto.sport.response.SportShortResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GoalResponse {
    private String id;
    private SportShortResponse sport;
    private GoalType type;
    private GoalTimeFrame timeFrame;
    private Long amountGain;
    private Long amountGoal;
    private Boolean isActive;
    private List<GoalHistoryResponse> histories;
}
