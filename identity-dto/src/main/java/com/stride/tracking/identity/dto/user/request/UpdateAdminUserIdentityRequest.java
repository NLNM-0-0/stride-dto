package com.stride.tracking.identity.dto.user.request;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateAdminUserIdentityRequest{
    private String email;
    private String password;
    private Boolean isBlocked;
}
