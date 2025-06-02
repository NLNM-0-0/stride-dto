package com.stride.tracking.metric.dto.user.event;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserCreatedEvent {

    @NotBlank(message = "User ID must not be blank")
    private String userId;

    @NotNull(message = "Time must not be null")
    private Instant time;

    @NotBlank(message = "Provider must not be blank")
    private String provider;
}
