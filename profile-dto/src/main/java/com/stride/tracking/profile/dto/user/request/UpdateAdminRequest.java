package com.stride.tracking.profile.dto.user.request;

import com.stride.tracking.profile.dto.annotation.IsDob;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UpdateAdminRequest {

    @Email(message = "Email must be valid")
    @Size(min = 1, message = "Email must not be empty")
    private String email;

    @IsDob
    private String dob;

    @Size(min = 1, message = "Name must not be empty")
    private String name;

    @Size(min = 1, message = "Avatar must not be empty")
    private String ava;

    private Boolean isBlocked;
}
