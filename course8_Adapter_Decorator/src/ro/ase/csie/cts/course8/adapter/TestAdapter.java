package ro.ase.csie.cts.course8.adapter;

import ro.ase.csie.cts.course8.adapter.disney.DisneyActions;
import ro.ase.csie.cts.course8.adapter.disney.DonaldDuck;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TestAdapter {

    public static void main(String[] args) {
        //simulate the game by using the existing character framework
        SuperheroCharacter fantasyHero = new FantasySuperhero("Blue Dragon", 1000, true);

        fantasyHero.move();
        fantasyHero.takeHit(500);
        fantasyHero.heal(200);

        // use a Disney character as a SuperheroCharacter one

        DisneyActions donald = new DonaldDuck(500);
        donald.changeLocation(100, 500);
        donald.isWounded(100);
        donald.isHealed(90);

        ArrayList<SuperheroCharacter> gameHeroes = new ArrayList<>();
        gameHeroes.add(fantasyHero);

        Disney2SuperheroAdapter donaldAdapter = new Disney2SuperheroAdapter(donald);
        gameHeroes.add(donaldAdapter);

        System.out.println("---------------------------");

        for(SuperheroCharacter hero: gameHeroes){
            hero.crouch();
            hero.takeHit(50);
            hero.heal(50);
        }
    }
}
