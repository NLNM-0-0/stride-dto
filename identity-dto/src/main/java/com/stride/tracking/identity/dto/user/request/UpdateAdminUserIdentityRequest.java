package com.stride.tracking.identity.dto.user.request;

import jakarta.validation.constraints.Email;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateAdminUserIdentityRequest {

    @Email(message = "Email must be valid")
    private String email;

    private Boolean isBlocked;
}
