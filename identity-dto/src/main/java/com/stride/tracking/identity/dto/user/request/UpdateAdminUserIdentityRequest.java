package com.stride.tracking.identity.dto.user.request;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateAdminUserIdentityRequest{
    private String email;
    private Boolean isBlocked;
}
