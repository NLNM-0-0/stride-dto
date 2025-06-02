package com.stride.tracking.core.dto.sport.request;

import com.stride.tracking.core.dto.annotation.HexColor;
import com.stride.tracking.core.dto.sport.SportMapType;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateSportRequest {

    @Size(min = 1, message = "Category ID must not be empty")
    private String categoryId;

    @Size(min = 1, message = "Name must not be empty")
    private String name;

    @Size(min = 1, message = "Image must not be empty")
    private String image;

    @HexColor
    private String color;

    private SportMapType sportMapType;

    @Valid
    private List<RuleRequest> rules;
}
