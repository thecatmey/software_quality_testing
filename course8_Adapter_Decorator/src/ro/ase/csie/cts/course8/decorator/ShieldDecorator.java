package ro.ase.csie.cts.course8.decorator;

public class ShieldDecorator extends AbstractDecorator{

    int shieldPower;

    public ShieldDecorator(SuperheroCharacter decoratedObject, int shieldType) {
        super(decoratedObject);
        this.shieldPower = shieldType;
    }

    @Override
    public void takeHit(int points) {
        int realPoints = points - shieldPower;
        if(realPoints < 0) {
            realPoints = 0;
        } else {
            this.decoratedObject.takeHit(realPoints);
        }
    }
}
