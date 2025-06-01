package com.stride.tracking.core.dto.category.event;

import com.stride.tracking.core.dto.sport.SportMapType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CategoryUpdatedEvent {
    private String id;
    private String name;
}
