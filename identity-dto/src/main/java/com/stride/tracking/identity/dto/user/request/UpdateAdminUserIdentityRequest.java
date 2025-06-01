package com.stride.tracking.identity.dto.user.request;

import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateAdminUserIdentityRequest extends UpdateNormalUserIdentityRequest {
    private String email;
    private String password;
}
