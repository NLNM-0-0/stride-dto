package com.stride.tracking.dto.event;

import com.stride.tracking.dto.request.Recipient;
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
