package com.stride.tracking.bridge.dto.fcm.request;

import jakarta.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PushFCMNotificationRequest {

    @NotBlank(message = "User ID must not be blank")
    private String userId;

    @NotBlank(message = "Title must not be blank")
    private String title;

    @NotBlank(message = "Message must not be blank")
    private String message;

    private String banner;
}
