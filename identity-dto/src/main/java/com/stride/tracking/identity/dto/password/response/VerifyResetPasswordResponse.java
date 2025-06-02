package com.stride.tracking.identity.dto.password.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VerifyResetPasswordResponse {
    private String resetPasswordId;
}
