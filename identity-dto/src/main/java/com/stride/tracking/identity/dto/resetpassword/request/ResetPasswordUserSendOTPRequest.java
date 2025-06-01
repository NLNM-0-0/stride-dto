package com.stride.tracking.identity.dto.resetpassword.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResetPasswordUserSendOTPRequest {
    private String username;
}
