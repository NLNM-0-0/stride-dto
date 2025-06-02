package com.stride.tracking.core.dto.category.event;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CategoryUpdatedEvent {

    @NotBlank(message = "ID must not be blank")
    private String id;

    @NotBlank(message = "Name must not be blank")
    private String name;
}
