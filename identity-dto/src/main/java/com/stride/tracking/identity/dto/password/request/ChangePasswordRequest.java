package com.stride.tracking.identity.dto.password.request;

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
public class ChangePasswordRequest {

    @NotBlank(message = "Old password must not be blank")
    @Size(min = 6, message = "Old password must have at least 6 characters")
    private String oldPassword;

    @NotBlank(message = "New password must not be blank")
    @Size(min = 6, message = "New password must have at least 6 characters")
    private String newPassword;
}
