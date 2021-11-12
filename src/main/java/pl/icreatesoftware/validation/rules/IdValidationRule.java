package pl.icreatesoftware.validation.rules;

import pl.icreatesoftware.dto.BasicData;

import java.util.function.Predicate;

public class IdValidationRule<T extends BasicData> implements Rule<T> {

    private final T objectToValidate;

    public IdValidationRule(T objectToValidate) {
        this.objectToValidate = objectToValidate;
    }

    @Override
    public Predicate<T> getValidation() {
        return objectToValidate -> objectToValidate.getId() != null;
    }

    @Override
    public String getMessage() {
        return "Id is mandatory";
    }
}
