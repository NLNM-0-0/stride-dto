package com.stride.tracking.dto.sport.event;

import com.stride.tracking.dto.sport.SportMapType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SportUpdateEvent {
    private String id;
    private String image;
    private String name;
    private String color;
    private SportMapType sportMapType;
}
