package com.stride.tracking.core.dto.sport.request;

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
public class CreateSportRequest {
    private String categoryId;
    private String name;
    private String image;
    private String color;
    private SportMapType sportMapType;
    private List<RuleRequest> rules;
}
