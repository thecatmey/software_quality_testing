package ro.ase.acs.cts.refactor_phase5;

import ro.ase.acs.cts.exceptions.InvalidPriceException;
import ro.ase.acs.cts.exceptions.InvalidValueException;
import ro.ase.acs.cts.exceptions.InvalidYearsSinceRegistrationException;

public interface SalesValidatorsInterface {

    public abstract void validatePrice (float initialPrice) throws InvalidPriceException;
    public abstract void validateYearsSinceRegistration (int accountAge) throws InvalidYearsSinceRegistrationException;
}
