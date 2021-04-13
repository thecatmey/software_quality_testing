package ro.ase.csie.cts.course8.adapter;

import ro.ase.csie.cts.course8.adapter.disney.DisneyActions;

public class Disney2SuperheroAdapter extends SuperheroCharacter{

    DisneyActions disneyCharacter = null;

    public Disney2SuperheroAdapter(DisneyActions disneyCharacter) {

        super(disneyCharacter.getName(), disneyCharacter.getPower());
        this.disneyCharacter = disneyCharacter;
    }

    @Override
    public void move() {
        this.disneyCharacter.changeLocation(0, 0);
    }

    @Override
    public void crouch() {
        System.out.println(String.format("%s is crouching", disneyCharacter.getName()));
    }

    @Override
    public void takeHit(int points) {
        this.disneyCharacter.isWounded(points);

    }

    @Override
    public void heal(int points) {
        this.disneyCharacter.isHealed(points);

    }

}
