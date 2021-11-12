package pl.icreatesoftware.validation.rules;

import pl.icreatesoftware.dto.Flowerpot;

import java.util.function.Predicate;

public class WaterLevelRule<T extends Flowerpot> implements Rule<T> {

    private final T objectToValidate;

    private WaterLevelRule(T objectToValidate) {
        this.objectToValidate = objectToValidate;
    }

    public static <T extends Flowerpot> WaterLevelRule<T> of(T objectToValidate) {
        return new WaterLevelRule<>(objectToValidate);
    }

    @Override
    public Predicate<T> getValidation() {
        return objectToValidate -> objectToValidate.getWaterLevel() > 0 &&
                objectToValidate.getWaterLevel() < 10;
    }

    @Override
    public String getMessage() {
        return "Water level should be between 0 and 10";
    }
}
