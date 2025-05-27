package com.stride.tracking.dto.progress.response;

import com.stride.tracking.dto.sport.response.SportWithMapTypeResponse;
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
    private SportWithMapTypeResponse sport;

    private List<ProgressBySportResponse> progresses;
}
