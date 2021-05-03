package decorator;

public class BasicPizza extends AbstractPizza{

    public BasicPizza(String name, boolean vegetarian) {
        super(name, vegetarian, "Tomato sauce");
    }

    @Override
    public double getPrice() {
        return 7.5;
    }


}
