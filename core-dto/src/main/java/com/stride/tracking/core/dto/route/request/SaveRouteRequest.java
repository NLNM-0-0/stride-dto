package com.stride.tracking.core.dto.route.request;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SaveRouteRequest {

    @Size(min = 1, message = "Route name must not be empty")
    private String routeName;
}
