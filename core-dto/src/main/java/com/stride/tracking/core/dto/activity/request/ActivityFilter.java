package com.stride.tracking.core.dto.activity.request;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ActivityFilter {
    private String userId;

    private String search;

    private List<String> sportIds;

    @Valid
    private ActivityDistanceFilter distance;

    @Valid
    private ActivityTimeFilter time;

    @Valid
    private ActivityElevationFilter elevation;

    @Valid
    private ActivityDateFilter date;
}
