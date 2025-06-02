package com.stride.tracking.metric.dto.activity.event;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ActivityCreatedEvent {

    @NotBlank(message = "Activity ID must not be blank")
    private String activityId;

    @NotNull(message = "Time must not be null")
    private Instant time;

    @NotBlank(message = "User ID must not be blank")
    private String userId;

    @NotBlank(message = "Sport ID must not be blank")
    private String sportId;

    @NotBlank(message = "Name must not be blank")
    private String name;

    @NotNull(message = "Moving time seconds must not be null")
    @Min(value = 0, message = "Moving time seconds must be zero or positive")
    private Long movingTimeSeconds;

    @NotNull(message = "Elevation gain must not be null")
    @PositiveOrZero(message = "Elevation gain must be zero or positive")
    private Long elevationGain;

    @NotNull(message = "Distance must not be null")
    @PositiveOrZero(message = "Distance must be zero or positive")
    private Long distance;

    @NotBlank(message = "Map image must not be blank")
    private String mapImage;

    @NotNull(message = "Calories must not be null")
    @PositiveOrZero(message = "Calories must be zero or positive")
    private Integer calories;

    @NotNull(message = "Avg heart rate must not be null")
    @PositiveOrZero(message = "Avg heart rate must be zero or positive")
    private Double avgHearRate;
}
