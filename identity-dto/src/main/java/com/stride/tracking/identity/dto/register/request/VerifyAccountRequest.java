package com.stride.tracking.identity.dto.register.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VerifyAccountRequest {

    @NotBlank(message = "Token must not be blank")
    private String token;
}
