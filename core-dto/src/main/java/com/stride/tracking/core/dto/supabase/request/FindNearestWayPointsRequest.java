package com.stride.tracking.core.dto.supabase.request;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
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
public class FindNearestWayPointsRequest {

    @NotBlank(message = "Type must not be blank")
    private String type;

    @Valid
    @NotNull(message = "Data list must not be null")
    @NotEmpty(message = "Data list must not be empty")
    private List<PointRequest> data;
}
