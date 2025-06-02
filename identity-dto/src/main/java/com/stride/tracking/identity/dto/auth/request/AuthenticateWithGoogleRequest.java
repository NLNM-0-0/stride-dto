package com.stride.tracking.identity.dto.auth.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthenticateWithGoogleRequest {

    @NotBlank(message = "ID Token must not be blank")
    private String idToken;
}
