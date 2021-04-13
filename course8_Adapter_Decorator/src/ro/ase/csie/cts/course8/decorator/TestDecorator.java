package ro.ase.csie.cts.course8.decorator;

import javax.annotation.processing.SupportedOptions;

public class TestDecorator {

    public static void main(String[] args) {
        SuperheroCharacter fantasyHero = new FantasySuperhero("Blue Dragon", 1000, true);

        fantasyHero.move();
        fantasyHero.takeHit(500);

        //the dragon should look and behave like a wounded one
        SuperheroCharacter woundedHero = new WoundedDecorator(fantasyHero);

        woundedHero.move();

        fantasyHero.heal(200);

        //add a shield/ armor to dragon

        SuperheroCharacter heroWithShield = new ShieldDecorator(fantasyHero, 200);
        heroWithShield.takeHit(500);

        SuperheroCharacter woundedHeroWithShield = new ShieldDecorator(woundedHero, 250);

        woundedHeroWithShield.move();
        woundedHeroWithShield.takeHit(260);
    }
}
