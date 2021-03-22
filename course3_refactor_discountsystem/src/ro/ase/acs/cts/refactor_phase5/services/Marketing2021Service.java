package ro.ase.acs.cts.refactor_phase5.services;

import ro.ase.acs.cts.refactor_phase5.marketing.MarketingStrategyInterface;

public class Marketing2021Service implements MarketingStrategyInterface {

    @Override
    public float getFidelityDiscount(int yearsSinceRegistration) {
        return (yearsSinceRegistration > FIDELITY_YEARS_THRESHOLD) ? MAX_FIDELITY_DISCOUNT : (float)yearsSinceRegistration/100;
    }
}
