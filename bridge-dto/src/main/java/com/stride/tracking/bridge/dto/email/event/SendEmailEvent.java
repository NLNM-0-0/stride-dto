package com.stride.tracking.bridge.dto.email.event;

import com.stride.tracking.bridge.dto.email.request.Recipient;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SendEmailEvent {

    @Valid
    @NotNull(message = "Recipient must not be null")
    private Recipient recipient;

    @NotBlank(message = "Subject must not be blank")
    private String subject;

    @NotBlank(message = "Body must not be blank")
    private String body;
}
