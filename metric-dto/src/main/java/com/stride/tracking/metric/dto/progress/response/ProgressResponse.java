package com.stride.tracking.metric.dto.progress.response;


import com.stride.tracking.metric.dto.sport.response.SportShortResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProgressResponse {
    private SportShortResponse sport;

    private List<ProgressBySportResponse> progresses;
}
