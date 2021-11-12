package pl.icreatesoftware.validation;

import pl.icreatesoftware.validation.rules.Rule;

import java.util.Objects;

public class ValidatorImpl<T> implements Validator<T>{

    private final T objectToValidate;

    private ValidatorImpl(T objectToValidate) {
        this.objectToValidate = objectToValidate;
    }

    public static <T> Validator<T> of(T objectToValidate) {
        return new ValidatorImpl<>(Objects.requireNonNull(objectToValidate));
    }

    @Override
    public boolean check(Rule<T> rule) {
        //TODO: do sth with validation message (maybe log it?)
        return rule.getValidation().test(objectToValidate);
    }
}
