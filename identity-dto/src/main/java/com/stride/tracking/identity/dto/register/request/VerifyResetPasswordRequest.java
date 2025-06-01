package com.stride.tracking.identity.dto.register.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class VerifyResetPasswordRequest {
    private String username;
    private String token;
}
