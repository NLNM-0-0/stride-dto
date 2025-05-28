package com.stride.tracking.dto.progress.response;

import com.stride.tracking.dto.progress.ProgressTimeFrame;
import com.stride.tracking.dto.sport.response.SportShortResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProgressDetailResponse {
    private SportShortResponse sport;
    private List<SportShortResponse> availableSports;

    private Map<ProgressTimeFrame, List<ProgressBySportResponse>> progresses;
}
