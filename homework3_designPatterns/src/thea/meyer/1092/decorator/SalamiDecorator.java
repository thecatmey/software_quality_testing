package decorator;

public class SalamiDecorator extends AbstractDecorator{

    public SalamiDecorator(AbstractPizza decoratedPizza) {
        super(decoratedPizza);
        this.description += ", Salami";
        this.name += " + Salami";
        this.vegetarian = false;
    }

    @Override
    public double getPrice() {
        return decoratedPizza.getPrice()+1.5;
    }
}
