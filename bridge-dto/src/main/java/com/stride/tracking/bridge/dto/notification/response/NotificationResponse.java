package com.stride.tracking.bridge.dto.notification.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NotificationResponse {
    private String id;
    private String title;
    private String body;

    private Date createdAt;

    private boolean seen;
}
