package com.stride.tracking.dto.activity.response;

import com.stride.tracking.dto.sport.response.SportResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ActivityResponse {
    private String id;
    private String name;
    private String description;
    private SportResponse sport;
    private ActivityUserResponse user;
    private Long elapsedTimeSeconds;
    private Long movingTimeSeconds;
    private Integer calories;
    private Double carbonSaved;
    private Integer rpe;

    private String geometry;

    private List<String> images;
    private String mapImage;

    private List<Integer> elevations;
    private Integer elevationGain;
    private Integer maxElevation;

    private List<Double> speeds;
    private Double avgSpeed;
    private Double maxSpeed;

    private List<Double> distances;
    private Double totalDistance;

    private List<Integer> heartRates;
    private List<HeartRateZoneResponse> heartRateZones;
    private Double avgHearRate;
    private Integer maxHearRate;

    private LocationResponse location;

    private String routeId;

    private Date createdAt;
}
