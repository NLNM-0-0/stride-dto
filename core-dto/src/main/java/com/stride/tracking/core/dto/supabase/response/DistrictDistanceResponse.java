package com.stride.tracking.core.dto.supabase.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DistrictDistanceResponse {
    private String districtName;
    private Double distance;
}
