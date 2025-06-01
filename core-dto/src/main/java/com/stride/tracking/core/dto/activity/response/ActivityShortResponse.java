package com.stride.tracking.core.dto.activity.response;

import com.stride.tracking.core.dto.sport.response.SportResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ActivityShortResponse {
    private String id;
    private String name;
    private SportResponse sport;
    private ActivityUserResponse user;
    private Double totalDistance;
    private Integer elevationGain;
    private Long movingTimeSeconds;
    private String mapImage;
    private LocationResponse location;
    private Date createdAt;
}
