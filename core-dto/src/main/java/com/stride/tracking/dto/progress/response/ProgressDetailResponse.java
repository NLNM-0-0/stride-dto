package com.stride.tracking.dto.progress.response;

import com.stride.tracking.dto.progress.ProgressTimeFrame;
import com.stride.tracking.dto.sport.response.SportWithMapTypeShortResponse;
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
    private SportWithMapTypeShortResponse sport;
    private List<SportWithMapTypeShortResponse> availableSports;

    private Map<ProgressTimeFrame, List<ProgressBySportResponse>> progresses;
}
