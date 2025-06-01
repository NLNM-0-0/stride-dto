package com.stride.tracking.identity.dto.user.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateUserIdentityRequest {
    private String email;
    private String password;
    private Boolean isBlocked;
}
