package com.stride.tracking.profile.dto.user.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {
    private String id;
    private String name;
    private String email;
    private String ava;
    private String dob;
    private Boolean isAdmin;
    private Boolean isBlocked;
}
