package com.stride.tracking.dto.register.request;

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
