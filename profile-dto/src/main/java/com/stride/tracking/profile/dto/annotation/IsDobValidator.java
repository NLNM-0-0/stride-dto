package com.stride.tracking.profile.dto.annotation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.time.LocalDate;

public class IsDobValidator implements ConstraintValidator<IsDob, String> {

    private static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.STRICT);

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null || value.isBlank()) {
            return true;
        }

        try {
            LocalDate.parse(value, FORMATTER);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
