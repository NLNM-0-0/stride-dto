package com.stride.tracking.bridge.dto.email.request;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SendEmailRequest {

    @Valid
    @NotNull(message = "Recipient must not be null")
    private Recipient to;

    @NotBlank(message = "Subject must not be blank")
    private String subject;

    @NotBlank(message = "HTML content must not be blank")
    private String htmlContent;
}
