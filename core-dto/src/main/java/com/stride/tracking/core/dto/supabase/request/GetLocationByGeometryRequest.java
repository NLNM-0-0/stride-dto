package com.stride.tracking.core.dto.supabase.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetLocationByGeometryRequest {
    private GeometryRequest geometry;
}
