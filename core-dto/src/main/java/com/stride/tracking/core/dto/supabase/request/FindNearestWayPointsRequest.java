package com.stride.tracking.core.dto.supabase.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FindNearestWayPointsRequest {
    private String type;
    private List<PointRequest> data;
}
