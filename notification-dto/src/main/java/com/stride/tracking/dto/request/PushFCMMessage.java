package com.stride.tracking.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PushFCMMessage {
    private List<String> fcmTokens;
    private String title;
    private String message;
}
