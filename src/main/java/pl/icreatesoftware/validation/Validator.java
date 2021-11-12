package pl.icreatesoftware.validation;

import pl.icreatesoftware.validation.rules.Rule;

public interface Validator<T> {
    boolean check(Rule<T> rule);
}
