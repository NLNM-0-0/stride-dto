package com.stride.tracking.dto.route.request;

import com.stride.tracking.dto.sport.SportMapType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetRecommendRouteRequest {
    private String sportId;
    private Double latitude;
    private Double longitude;
    private SportMapType sportMapType;
    private int limit;
}
