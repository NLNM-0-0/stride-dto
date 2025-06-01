package com.stride.tracking.bridge.dto.supabase.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GeometryRequest {
    private String type;
    private List<List<Double>> coordinates;
}
