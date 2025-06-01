package com.stride.tracking.core.dto.supabase.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FindDistrictsNearPointRequest {
    private Double lat;
    private Double lon;
    private int around;
}
