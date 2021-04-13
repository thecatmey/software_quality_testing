package ro.ase.csie.cts.course8.decorator;

public abstract class AbstractDecorator extends SuperheroCharacter{

    SuperheroCharacter decoratedObject;

    public AbstractDecorator(SuperheroCharacter decoratedObject) {
        super(decoratedObject.name, decoratedObject.power);
        this.decoratedObject = decoratedObject;
    }

    @Override
    public void move() {
        this.decoratedObject.move();
    }

    @Override
    public void crouch() {
        this.decoratedObject.crouch();
    }

    @Override
    public void takeHit(int points) {
        this.decoratedObject.takeHit(points);
    }

    @Override
    public void heal(int points) {
        this.decoratedObject.takeHit(points);
    }
}
