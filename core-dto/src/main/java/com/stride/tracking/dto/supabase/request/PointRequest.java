package com.stride.tracking.dto.supabase.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PointRequest {
    private Double lat;
    private Double lon;
}
