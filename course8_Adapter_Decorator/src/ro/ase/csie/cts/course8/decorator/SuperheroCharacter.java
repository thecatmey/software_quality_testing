package ro.ase.csie.cts.course8.decorator;

public abstract class SuperheroCharacter {

    String name;
    int power;

    public SuperheroCharacter(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public abstract void move();
    public abstract void crouch();
    public abstract  void takeHit(int points);
    public abstract void heal(int points);

}
