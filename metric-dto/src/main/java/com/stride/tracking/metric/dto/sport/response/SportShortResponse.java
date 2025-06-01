package com.stride.tracking.metric.dto.sport.response;

import com.stride.tracking.metric.dto.category.response.CategoryResponse;
import com.stride.tracking.metric.dto.sport.SportMapType;
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
    private String color;
    private CategoryResponse category;
    private SportMapType sportMapType;
}
