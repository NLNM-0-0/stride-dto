package com.stride.tracking.profile.dto.profile.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateProfileRequest {
    private String name;
    private String ava;
    private String email;
}