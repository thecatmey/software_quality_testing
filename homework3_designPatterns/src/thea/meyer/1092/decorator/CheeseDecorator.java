package decorator;

public class CheeseDecorator extends AbstractDecorator{

    public CheeseDecorator(AbstractPizza decoratedPizza) {
        super(decoratedPizza);
        this.description += ", Cheese ";
        this.name += " + Cheese";
    }

    @Override
    public double getPrice() {
        return decoratedPizza.getPrice()+1;
    }
}
