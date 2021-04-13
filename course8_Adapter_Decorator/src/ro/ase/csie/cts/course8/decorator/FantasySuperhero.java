package ro.ase.csie.cts.course8.decorator;

public class FantasySuperhero extends SuperheroCharacter {

    boolean canFly;

    public FantasySuperhero(String name, int power, boolean canFly){
        super(name, power);
        this.canFly = canFly;
    }

    @Override
    public void move() {
        if(this.canFly){
            System.out.println("Is flying");
        } else {
            System.out.println("Is moving fast");
        }
    }

    @Override
    public void crouch() {
        if(this.canFly){
            System.out.println("Not able to crouch");
        } else {
            System.out.println("Is getting close to the ground");
        }
    }

    @Override
    public void takeHit(int points) {
        System.out.printf(String.format("\n%s took a hit of %d points", name, points));
        this.power -= points;
    }

    @Override
    public void heal(int points) {
        System.out.printf(String.format("\n%s is healing %d points", name, points));
        this.power += points;
    }
}
