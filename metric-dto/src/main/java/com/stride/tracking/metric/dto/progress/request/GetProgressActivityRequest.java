package com.stride.tracking.metric.dto.progress.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetProgressActivityRequest {

    @NotNull(message = "fromDate must not be null")
    private Long fromDate;

    @NotNull(message = "toDate must not be null")
    private Long toDate;

    @NotBlank(message = "sportId must not be blank")
    private String sportId;
}
