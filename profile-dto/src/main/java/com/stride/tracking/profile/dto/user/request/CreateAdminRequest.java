package com.stride.tracking.profile.dto.user.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateAdminRequest {
    private String name;
    private String dob;
    private String ava;
    private String email;
    private String password;
}
