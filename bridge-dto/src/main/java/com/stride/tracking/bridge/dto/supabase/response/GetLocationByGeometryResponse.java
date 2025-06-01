package com.stride.tracking.bridge.dto.supabase.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GetLocationByGeometryResponse {
    private String ward;
    private String district;
    private String city;
}
