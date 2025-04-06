package com.stride.tracking.dto.response;

import com.stride.tracking.dto.constant.Equipment;
import com.stride.tracking.dto.constant.HeartRateZone;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {
    private String id;
    private String name;
    private String ava;
    private String dob;
    private int height;
    private int weight;
    private boolean male;
    private String city;
    private int maxHeartRate;
    private Map<Equipment, Integer> equipmentsWeight;
    private Map<HeartRateZone, Integer> heartRateZones;
    private boolean isBlock;
}
