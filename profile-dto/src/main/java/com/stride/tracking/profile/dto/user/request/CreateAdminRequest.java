package com.stride.tracking.profile.dto.user.request;

import com.stride.tracking.profile.dto.annotation.IsDob;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateAdminRequest {

    @NotBlank(message = "Name must not be blank")
    private String name;

    @IsDob
    private String dob;

    @NotBlank(message = "Ava must not be blank")
    private String ava;

    @NotBlank(message = "Email must not be blank")
    @Email(message = "Email must be valid")
    private String email;

    @NotBlank(message = "Password must not be blank")
    @Size(min = 6, message = "Password must have at least 6 characters")
    private String password;
}
