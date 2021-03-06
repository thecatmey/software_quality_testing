package ro.ase.csie.cts.course8.adapter.disney;

public class DonaldDuck implements DisneyActions{

    String name;
    int lifePoints;

    public DonaldDuck(int lifePoints) {
        super();
        this.name = "Donald Duck";
        this.lifePoints = lifePoints;
    }

    @Override
    public void changeLocation(int x, int y) {
        System.out.println("Is moving to new location");
    }

    @Override
    public void isWounded(int lostLifePoints) {
        System.out.println(String.format("%s lost %d points", name, lostLifePoints));

    }

    @Override
    public void isHealed(int recoveredPoints) {
        System.out.println(String.format("%s recovered %d points", name, recoveredPoints));
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getPower() {
        return this.lifePoints;
    }
}
