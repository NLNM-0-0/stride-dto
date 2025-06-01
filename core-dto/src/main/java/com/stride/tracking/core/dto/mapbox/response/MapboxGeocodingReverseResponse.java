package com.stride.tracking.core.dto.mapbox.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MapboxGeocodingReverseResponse {
    private String place;
    private String locality;
    private String neighborhood;
}
