package decorator;

public abstract class AbstractDecorator extends AbstractPizza {

    AbstractPizza decoratedPizza;

    public AbstractDecorator(AbstractPizza decoratedPizza) {
        super(decoratedPizza.name, decoratedPizza.vegetarian, decoratedPizza.description);
        this.decoratedPizza = decoratedPizza;
    }
}
