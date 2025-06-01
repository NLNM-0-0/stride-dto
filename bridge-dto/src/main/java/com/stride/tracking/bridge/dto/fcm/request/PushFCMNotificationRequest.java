package com.stride.tracking.bridge.dto.fcm.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PushFCMNotificationRequest {
    private String userId;
    private String title;
    private String message;
    private String banner;
}
