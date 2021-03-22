package ro.ase.acs.cts.refactor_phase3;
import ro.ase.acs.cts.exceptions.InvalidValueException;

public class SalesStrategy {

    public static final int FIDELITY_YEARS_THRESHOLD = 10;
    public static final float MAX_FIDELITY_DISCOUNT = 0.15f;
    public static final float NORMAL_DISCOUNT = 0.1f;

    //float fidelityDiscount = (productType != ProductType.NEW) ? getFidelityDiscount(yearsSinceRegistration) : 0;

    public static float getFidelityDiscount (int yearsSinceRegistration)
    {
        return (yearsSinceRegistration > FIDELITY_YEARS_THRESHOLD) ? MAX_FIDELITY_DISCOUNT : (float)yearsSinceRegistration/100;
    }

    //Problem: Fidelity discount should be 0 for NEW products

    public static float getPriceWithDiscount (float initialPrice, float discount, float fidelityDiscount){
        return (initialPrice - (discount * initialPrice)) - fidelityDiscount * (initialPrice - (discount * initialPrice));
    }

    public static float computeFinalPrice(ProductType productType, float initialPrice, int yearsSinceRegistration) throws InvalidValueException {

        if(initialPrice <= 0 || yearsSinceRegistration < 0){
            throw new InvalidValueException();
        }

        return getPriceWithDiscount(initialPrice, productType.getDiscount(), getFidelityDiscount(yearsSinceRegistration));
    }

}
