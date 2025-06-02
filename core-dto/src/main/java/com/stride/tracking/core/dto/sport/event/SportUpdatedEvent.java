package com.stride.tracking.core.dto.sport.event;

import com.stride.tracking.core.dto.sport.SportMapType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SportUpdatedEvent {

    @NotBlank(message = "Sport ID must not be blank")
    private String id;

    @NotBlank(message = "Image must not be blank")
    private String image;

    @NotBlank(message = "Name must not be blank")
    private String name;

    @NotBlank(message = "Color must not be blank")
    private String color;

    @NotBlank(message = "Category ID must not be blank")
    private String categoryId;

    @NotNull(message = "Sport map type must not be null")
    private SportMapType sportMapType;
}
