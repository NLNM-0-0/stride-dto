package com.stride.tracking.core.dto.goal.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GoalHistoryResponse {
    private Date date;
    private Long amountGain;
    private Long amountGoal;
}
