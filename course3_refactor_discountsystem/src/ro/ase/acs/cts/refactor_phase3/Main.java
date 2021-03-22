package ro.ase.acs.cts.refactor_phase3;


public class Main {
    public static void main (String[] args) throws Exception{
        printResult(ProductType.DISCOUNTED, 10, 8);
    }

    private static void printResult (ProductType productType, float initialPrice, int yearsSinceRegistration) throws Exception{
        float result = SalesStrategy.computeFinalPrice(productType, initialPrice, yearsSinceRegistration);
        System.out.println("The price is: "+ Math.round(100*result)/100.0);
    }
}

