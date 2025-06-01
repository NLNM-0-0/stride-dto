package com.stride.tracking.core.dto.mapbox.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MapboxDirectionResponse {
    private List<List<Double>> coordinates;
    private List<MapboxWayPoint> wayPoints;
}
