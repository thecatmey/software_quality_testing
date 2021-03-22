package ro.ase.acs.cts.refactor_phase5;

import ro.ase.acs.cts.exceptions.InvalidPriceException;
import ro.ase.acs.cts.exceptions.InvalidYearsSinceRegistrationException;

public class ValidatorService implements SalesValidatorsInterface {

    @Override
    public void validatePrice(float initialPrice) throws InvalidPriceException{
        if(initialPrice <= 0) {
            throw new InvalidPriceException();
        }
    }

    @Override
    public void validateYearsSinceRegistration (int accountAge) throws InvalidYearsSinceRegistrationException{
            if(accountAge <= 0) {
                throw new InvalidYearsSinceRegistrationException();
        }

    }

}
