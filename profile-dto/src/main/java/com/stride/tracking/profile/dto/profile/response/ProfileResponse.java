package com.stride.tracking.profile.dto.profile.response;

import com.stride.tracking.profile.dto.profile.Equipment;
import com.stride.tracking.profile.dto.profile.HeartRateZone;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProfileResponse {
    private String id;
    private String name;
    private String ava;
    private String dob;
    private Integer height;
    private Integer weight;
    private Boolean male;
    private String city;
    private Integer maxHeartRate;
    private Map<Equipment, Integer> equipmentsWeight;
    private Map<HeartRateZone, Integer> heartRateZones;
    private Boolean isBlock;
}
