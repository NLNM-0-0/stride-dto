package com.stride.tracking.dto.sport.request;

import com.stride.tracking.dto.sport.SportMapType;
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
    private SportMapType sportMapType;
    private List<RuleRequest> rules;
}
