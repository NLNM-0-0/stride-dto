package com.stride.tracking.metric.dto.activity.event;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ActivityDeletedEvent {

    @NotBlank(message = "Activity ID must not be blank")
    private String activityId;
}
