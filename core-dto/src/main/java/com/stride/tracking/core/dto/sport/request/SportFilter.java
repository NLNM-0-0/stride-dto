package com.stride.tracking.core.dto.sport.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SportFilter {
    private String name;
    private String categoryId;
}
