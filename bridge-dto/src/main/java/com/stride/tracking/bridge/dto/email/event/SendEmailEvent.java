package com.stride.tracking.bridge.dto.email.event;

import com.stride.tracking.bridge.dto.email.request.Recipient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SendEmailEvent {
    private Recipient recipient;
    private String subject;
    private String body;
}
