package ro.ase.csie.cts.simplefactory;

public class TestSimpleFactory {

    public static void main(String[] args) {

        SuperHero superman = new SuperHero("Superman");
        superman.setWeapon(new Bazooka("goes Boom"));   //This should be avoided
        superman.setWeapon(new MachineGun("Fast  pewPew", 50, 100));

        AbstractWeapon bazooka = WeaponsFactory.getWeapon(WeaponType.BAZOOKA, "Boom");
        superman.setWeapon(null);
        superman.setWeapon(WeaponsFactory.getWeapon(WeaponType.MACHINEGUN, "MG"));
    }
}
