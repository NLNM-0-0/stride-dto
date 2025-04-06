package com.stride.tracking.dto.request;

import com.stride.tracking.dto.constant.Equipment;
import com.stride.tracking.dto.constant.HeartRateZone;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UpdateUserRequest {
    private String name;
    private String ava;
    private String city;
    private String dob;
    private Integer height;
    private Integer weight;
    private Boolean male;
    private Integer maxHeartRate;
    private Map<HeartRateZone, Integer> heartRateZones;
    private Map<Equipment, Integer> equipmentsWeight;
}
