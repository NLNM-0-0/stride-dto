package com.stride.tracking.profile.dto.profile.request;

import com.stride.tracking.profile.dto.profile.Equipment;
import com.stride.tracking.profile.dto.profile.HeartRateZone;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UpdateProfileRequest {
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
