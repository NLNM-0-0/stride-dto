package com.stride.tracking.dto.progress.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProgressActivityResponse {
    private String id;
    private String name;
    private String mapImage;
    private Long distance;
    private Long elevation;
    private Long time;
    private Date createdAt;
}
