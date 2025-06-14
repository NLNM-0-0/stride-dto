package com.stride.tracking.core.dto.route.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RouteFilter {
    private String userId;
    private String sportId;
    private Boolean publicRoute;
    private Double minDistance;
}
