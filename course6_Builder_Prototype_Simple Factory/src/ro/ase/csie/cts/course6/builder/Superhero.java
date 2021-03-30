package ro.ase.csie.cts.course6.builder;

public class Superhero {
    String name;
    int lifePoints;
    boolean isVillain;
    boolean isCriticallyWounded;

    Weapon leftHandWeapon;
    Weapon rightHandWeapon;
    String superpower;
    String superSuperpower;

    private Superhero(){

    }

    public Superhero(String name, int lifePoints, boolean isVillain, boolean isCriticallyWounded, Weapon leftHandWeapon, Weapon rightHandWeapon, String superpower, String superSuperpower) {
        this.name = name;
        this.lifePoints = lifePoints;
        this.isVillain = isVillain;
        this.isCriticallyWounded = isCriticallyWounded;
        this.leftHandWeapon = leftHandWeapon;
        this.rightHandWeapon = rightHandWeapon;
        this.superpower = superpower;
        this.superSuperpower = superSuperpower;

    }

    public static class SuperheroBuilder {
        Superhero superhero = null;

        public SuperheroBuilder(String name, int lifePoints) {
            this.superhero = new Superhero();
            this.superhero.name = name;
            this.superhero.lifePoints = lifePoints;

            //this.superhero = new Superhero(name, lifePoints, false, false, null, null, "", "");

        }

        public SuperheroBuilder isVillian(){
            this.superhero.isVillain = true;
            return this;
        }

        public SuperheroBuilder isWounded(){
            this.superhero.isCriticallyWounded = true;
            return this;
        }

        public SuperheroBuilder setLeftWeapon(Weapon weapon){
            this.superhero.leftHandWeapon = weapon;
            return this;
        }

        public SuperheroBuilder setRightWeapon(Weapon weapon){
            this.superhero.rightHandWeapon = weapon;
            return this;
        }

        public SuperheroBuilder setSuperPower(String superPower){
            this.superhero.superpower = superPower;
            return this;
        }

        public SuperheroBuilder setSuperSuperPower (String superSuperPower){
            this.superhero.superSuperpower = superSuperPower;
            return this;
        }

        public Superhero build(){
            return this.superhero;
        }
    }
}
