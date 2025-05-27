package com.stride.tracking.dto.sport.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SportShortResponse {
    private String id;
    private String name;
    private String image;
}
