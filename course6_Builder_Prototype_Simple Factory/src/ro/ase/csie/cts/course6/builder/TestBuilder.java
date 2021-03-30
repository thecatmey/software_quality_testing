package ro.ase.csie.cts.course6.builder;

public class TestBuilder {
    public static void main(String[] args) {

        // 1. create
        // Superhero superhero = new Superhero();
        // 2. init
        // Dont forget to initialise the object with values

        // Initialise all values directly
        Weapon pistol = new Weapon("Pistol");
        Superhero superhero1 = new Superhero("Superman", 100, false, false, pistol, null, "fly", "");
        Superhero superhero2 = new Superhero("Batman", 100, false, false, null, null, "having money", "");

        // Builder
        Superhero superman = new Superhero.SuperheroBuilder("Superman", 100)
                .setLeftWeapon(pistol)
                .setSuperPower("Fly")
                .setSuperSuperPower("Laser Eyes")
                .build();

        Superhero joker = new Superhero.SuperheroBuilder("Joker", 200)
                .isVillian()
                .setRightWeapon(pistol)
                .build();

        Superhero dummyHero = new Superhero.SuperheroBuilder("Dummy", 50).build();
    }

}
