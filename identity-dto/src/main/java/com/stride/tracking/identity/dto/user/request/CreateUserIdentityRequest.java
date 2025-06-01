package com.stride.tracking.identity.dto.user.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateUserIdentityRequest {
    private String userId;
    private String email;
    private String password;
    private Boolean isAdmin;
}
