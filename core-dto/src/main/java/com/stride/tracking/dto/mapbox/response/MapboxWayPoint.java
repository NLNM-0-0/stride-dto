package com.stride.tracking.dto.mapbox.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MapboxWayPoint {
    private Double latitude;
    private Double longitude;
    private String name;
    private int freq;
}
