package com.stride.tracking.identity.dto.register.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class VerifyResetPasswordRequest {

    @NotBlank(message = "Username must not be blank")
    private String username;

    @NotBlank(message = "Token must not be blank")
    private String token;
}
