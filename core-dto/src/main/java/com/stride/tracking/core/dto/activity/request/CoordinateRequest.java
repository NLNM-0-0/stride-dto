package com.stride.tracking.core.dto.activity.request;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
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
public class CoordinateRequest {

    @NotEmpty(message = "Coordinate list must not be empty")
    @Size(min = 2, max = 2, message = "Coordinate must contain exactly 2 elements (longitude and latitude)")
    private List<Double> coordinate;

    @NotNull(message = "Timestamp must not be null")
    private Long timestamp;
}
