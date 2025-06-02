package com.stride.tracking.core.dto.annotation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = HexColorValidator.class)
@Target({ ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.ANNOTATION_TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface HexColor {
    String message() default "Color must be a valid hex code, e.g. #FFFFFF or #FFF";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
