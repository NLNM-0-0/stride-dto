package com.stride.tracking.core.dto.sport.response;

import com.stride.tracking.core.dto.category.response.CategoryResponse;
import com.stride.tracking.core.dto.sport.SportMapType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SportResponse {
    private String id;
    private CategoryResponse category;
    private String name;
    private String image;
    private SportMapType sportMapType;
    private String color;
    private List<RuleResponse> rules;
}
