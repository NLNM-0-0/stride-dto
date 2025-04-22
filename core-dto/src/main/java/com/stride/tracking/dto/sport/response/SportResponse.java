package com.stride.tracking.dto.sport.response;

import com.stride.tracking.dto.category.response.CategoryResponse;
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
    private List<RuleResponse> rules;
}
