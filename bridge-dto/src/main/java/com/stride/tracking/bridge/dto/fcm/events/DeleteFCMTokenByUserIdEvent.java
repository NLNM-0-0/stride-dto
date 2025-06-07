package com.stride.tracking.bridge.dto.fcm.events;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DeleteFCMTokenByUserIdEvent {
    private String userId;
}
