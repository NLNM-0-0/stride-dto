package com.stride.tracking.core.dto.activity.request;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateActivityRequest {

    @Min(value = 0, message = "RPE must be at least 0")
    @Max(value = 10, message = "RPE must be at most 10")
    private int rpe;

    @Size(min = 1, message = "Name must not be empty")
    private String name;

    @Size(min = 1, message = "Sport ID must not be empty")
    private String sportId;

    private List<String> images;

    @Size(min = 1, message = "Description must not be empty")
    private String description;
}
