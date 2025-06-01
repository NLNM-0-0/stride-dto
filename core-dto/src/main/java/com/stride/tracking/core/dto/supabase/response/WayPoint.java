package com.stride.tracking.core.dto.supabase.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WayPoint {
    private String name;
    private Double lat;
    private Double lon;
}
