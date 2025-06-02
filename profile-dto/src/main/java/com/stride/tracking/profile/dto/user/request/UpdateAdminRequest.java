package com.stride.tracking.profile.dto.user.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UpdateAdminRequest {
    private String email;
    private String dob;
    private String name;
    private String ava;
    private Boolean isBlocked;
}
