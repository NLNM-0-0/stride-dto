package com.stride.tracking.core.dto.elevation.request;

import jakarta.validation.Valid;
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
public class ElevationRequest {

    @Valid
    @NotNull(message = "Locations list must not be null")
    @Size(min = 1, message = "Locations list must contain at least one location")
    private List<LocationRequest> locations;
}
