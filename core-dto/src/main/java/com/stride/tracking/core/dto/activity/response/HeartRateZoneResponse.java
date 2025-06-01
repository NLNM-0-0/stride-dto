package com.stride.tracking.core.dto.activity.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HeartRateZoneResponse {
    private String zoneId;
    private String name;
    private int min;
    private int max;
    private int value;
}
