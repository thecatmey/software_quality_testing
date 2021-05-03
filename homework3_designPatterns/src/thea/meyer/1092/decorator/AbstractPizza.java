package decorator;

import composite.AbstractNode;
import composite.Dish;


public abstract class AbstractPizza extends Dish {
    //String name;
    //boolean vegetarian;
    //public String description;

    public AbstractPizza(String name, boolean vegetarian, String description) {
        super(name, vegetarian, description);

        /*this.name = name;
        this.vegetarian = vegetarian;
        this.description = description;*/
    }

    public abstract double getPrice();



}
