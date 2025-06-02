package com.stride.tracking.core.dto.supabase.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
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
public class GeometryRequest {

    @NotBlank(message = "Type must not be blank")
    private String type;

    @NotEmpty(message = "Coordinates must not be empty")
    private List<@Size(min = 2, max = 2, message = "Each coordinate must contain exactly 2 elements (longitude and latitude)") List<Double>> coordinates;
}
