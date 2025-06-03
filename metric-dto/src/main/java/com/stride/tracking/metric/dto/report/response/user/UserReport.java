package com.stride.tracking.metric.dto.report.response.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserReport {
    private Integer totalUsers;
    private List<UserDetailReport> users;
}
