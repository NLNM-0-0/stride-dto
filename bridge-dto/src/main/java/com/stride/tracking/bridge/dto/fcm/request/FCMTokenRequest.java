package com.stride.tracking.bridge.dto.fcm.request;

import jakarta.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FCMTokenRequest {
    @NotBlank(message = "Token must not be blank")
    private String token;
}
