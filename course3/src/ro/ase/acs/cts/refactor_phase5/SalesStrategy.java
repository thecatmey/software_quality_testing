package ro.ase.acs.cts.refactor_phase5;
import ro.ase.acs.cts.exceptions.InvalidValueException;
import ro.ase.acs.cts.refactor_phase5.marketing.MarketingStrategyInterface;

public class SalesStrategy {

    private MarketingStrategyInterface mkStrategy = null;
    private SalesValidatorsInterface sValidators = null;

    public SalesStrategy(MarketingStrategyInterface mkStrategy, SalesValidatorsInterface sValidators){

        if (mkStrategy == null || sValidators == null){
            throw new NullPointerException();
        }

        this.mkStrategy = mkStrategy;
        this.sValidators = sValidators;
    }

    //optional - depends on design specs
    // allowing changes of MarketingStrategy in the runtime
    void setMarketingStrategy (MarketingStrategyInterface mkStrategy){
        if (mkStrategy == null){
            throw new NullPointerException();
        }
        this.mkStrategy = mkStrategy;
    }


    /* public static float getFidelityDiscount (int yearsSinceRegistration)
    {
        return (yearsSinceRegistration > FIDELITY_YEARS_THRESHOLD) ? MAX_FIDELITY_DISCOUNT : (float)yearsSinceRegistration/100;
    }*/

    //Problem: Fidelity discount should be 0 for NEW products

    public static float getPriceWithDiscount (float initialPrice, float discount, float fidelityDiscount){
        float discountedPrice = (initialPrice - (discount * initialPrice));
        return discountedPrice - discountedPrice * fidelityDiscount;
    }

    public float computeFinalPrice(ProductType productType, float initialPrice, int yearsSinceRegistration) throws Exception {

        sValidators.validatePrice(initialPrice);
        sValidators.validateYearsSinceRegistration(yearsSinceRegistration);

        float fidelityDiscount = (productType != ProductType.NEW) ? mkStrategy.getFidelityDiscount(yearsSinceRegistration) : 0;
        return getPriceWithDiscount(initialPrice, productType.getDiscount(), fidelityDiscount);
    }

}
