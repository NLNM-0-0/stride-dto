package com.stride.tracking.core.dto.sport.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RuleRequest {

    @NotBlank(message = "Expression must not be blank")
    private String expression;

    @NotNull(message = "MET value must not be null")
    @Positive(message = "MET value must be positive")
    private Double met;
}
