package com.stride.tracking.core.dto.supabase.request;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FindDistrictsContainGeometryRequest {

    @Valid
    @NotNull(message = "Geometry must not be null")
    private GeometryRequest geometry;
}
