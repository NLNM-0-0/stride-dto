package com.stride.tracking.profile.dto.annotation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = IsDobValidator.class)
@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface IsDob {
    String message() default "Date must be in dd/MM/yyyy format";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
