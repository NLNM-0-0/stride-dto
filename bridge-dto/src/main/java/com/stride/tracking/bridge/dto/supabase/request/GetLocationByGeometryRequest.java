package com.stride.tracking.bridge.dto.supabase.request;

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
