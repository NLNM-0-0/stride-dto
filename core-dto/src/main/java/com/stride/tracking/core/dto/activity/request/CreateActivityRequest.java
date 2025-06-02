package com.stride.tracking.core.dto.activity.request;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateActivityRequest {

    @NotBlank(message = "Sport ID must not be blank")
    private String sportId;

    private String routeId;

    @NotBlank(message = "Name must not be blank")
    private String name;

    @NotNull(message = "Description must not be null")
    private String description;

    @NotNull(message = "Moving time must not be null")
    @PositiveOrZero(message = "Moving time must be zero or positive")
    private Long movingTimeSeconds;

    @NotNull(message = "Elapsed time must not be null")
    @PositiveOrZero(message = "Elapsed time must be zero or positive")
    private Long elapsedTimeSeconds;

    @Valid
    @NotNull(message = "Coordinates list must not be null")
    private List<CoordinateRequest> coordinates;

    @NotNull(message = "Heart rates list must not be null")
    private List<Integer> heartRates;

    @NotNull(message = "Images list must not be null")
    private List<String> images;

    @NotNull(message = "RPE must not be null")
    @Min(value = 0, message = "RPE must be at least 0")
    @Max(value = 10, message = "RPE must be at most 10")
    private int rpe;
}
