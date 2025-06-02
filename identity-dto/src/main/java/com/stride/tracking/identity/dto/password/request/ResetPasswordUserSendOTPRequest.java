package com.stride.tracking.identity.dto.password.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResetPasswordUserSendOTPRequest {

    @NotBlank(message = "Username must not be blank")
    private String username;
}
