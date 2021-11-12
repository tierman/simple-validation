package pl.icreatesoftware.validation.rules;

import java.util.function.Predicate;

public interface Rule<T> {
    Predicate<T> getValidation();
    String getMessage();
}
