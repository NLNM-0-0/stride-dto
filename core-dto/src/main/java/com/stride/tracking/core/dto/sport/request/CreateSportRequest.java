package com.stride.tracking.core.dto.sport.request;

import com.stride.tracking.core.dto.annotation.HexColor;
import com.stride.tracking.core.dto.sport.SportMapType;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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

    @NotBlank(message = "Category ID must not be blank")
    private String categoryId;

    @NotBlank(message = "Name must not be blank")
    private String name;

    @NotBlank(message = "Image must not be blank")
    private String image;

    @NotBlank(message = "Color must not be blank")
    @HexColor
    private String color;

    @NotNull(message = "Sport map type must not be null")
    private SportMapType sportMapType;

    @Valid
    @NotNull(message = "Rules list must not be null")
    private List<RuleRequest> rules;
}
