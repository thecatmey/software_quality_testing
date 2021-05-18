package ro.ase.csie.cts.course12.memento;

public class TestMemento {

    public static void main(String[] args) {

        Superhero hero = new Superhero("Superman", 100, "Fly");

        HeroRestorePoint initial = hero.saveData();

        hero.lifePoints += 200;

        System.out.println("Lifepoints: " + hero.lifePoints);

        hero.restoreData(initial);

        System.out.println("Lifepoints: " + hero.lifePoints);
    }
}
