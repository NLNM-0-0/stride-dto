package com.stride.tracking.metric.dto.report.response.user;

import com.stride.tracking.metric.dto.report.AuthProvider;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDetailReport {
    private AuthProvider provider;
    private Integer value;
}
