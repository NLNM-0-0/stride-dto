package com.stride.tracking.profile.dto.user.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserFilter {
    private String search;
    private Boolean isAdmin;
    private Boolean isBlocked;
}
