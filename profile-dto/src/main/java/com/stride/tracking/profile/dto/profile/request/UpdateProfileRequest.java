package com.stride.tracking.profile.dto.profile.request;

import com.stride.tracking.profile.dto.annotation.IsDob;
import com.stride.tracking.profile.dto.profile.Equipment;
import com.stride.tracking.profile.dto.profile.HeartRateZone;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
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

    @Size(min = 1, message = "Name must not be empty")
    private String name;

    @Size(min = 1, message = "Ava must not be empty")
    private String ava;

    @Size(min = 1, message = "City must not be empty")
    private String city;

    @IsDob
    private String dob;

    @PositiveOrZero(message = "Height must be zero or positive")
    private Integer height;

    @PositiveOrZero(message = "Weight must be zero or positive")
    private Integer weight;

    @NotNull(message = "Male must not be null")
    private Boolean male;

    @PositiveOrZero(message = "Max heart rate must be zero or positive")
    private Integer maxHeartRate;

    private Map<HeartRateZone, @PositiveOrZero(message = "Heart rate zone value must be zero or positive") Integer> heartRateZones;

    private Map<Equipment, @PositiveOrZero(message = "Equipment weight must be zero or positive") Integer> equipmentsWeight;
}
