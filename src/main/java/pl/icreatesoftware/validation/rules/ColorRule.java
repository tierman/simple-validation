package pl.icreatesoftware.validation.rules;

import pl.icreatesoftware.dto.Flower;

import java.util.function.Predicate;

public class ColorRule<T extends Flower> implements Rule<T> {

    private ColorRule(T objectToValidate) {
    }

    public static <T extends Flower> ColorRule<T> of(T objectToValidate) {
        return new ColorRule<>(objectToValidate);
    }

    @Override
    public Predicate<T> getValidation() {
        return objectToValidate -> objectToValidate.getColor() != null;
    }

    @Override
    public String getMessage() {
        return "Color is mandatory";
    }

}
