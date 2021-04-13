package ro.ase.csie.cts.course8.decorator;

public class WoundedDecorator extends AbstractDecorator{

    public WoundedDecorator(SuperheroCharacter decoratedObject) {
        super(decoratedObject);
    }

    @Override
    public void move() {
        System.out.println("The hero is barely moving because he is wounded");
        //super.move();
    }
}
