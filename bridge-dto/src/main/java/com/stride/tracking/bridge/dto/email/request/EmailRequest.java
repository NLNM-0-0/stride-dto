package com.stride.tracking.bridge.dto.email.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.Valid;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmailRequest {

    @Valid
    @NotEmpty(message = "Recipient list must not be empty")
    private List<Recipient> to;

    @NotBlank(message = "Subject must not be blank")
    private String subject;

    @NotBlank(message = "HTML content must not be blank")
    private String htmlContent;
}
