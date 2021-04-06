package ro.ase.csie.cts.factoryMethod;

import ro.ase.csie.cts.simplefactory.AbstractWeapon;
import ro.ase.csie.cts.simplefactory.SuperHero;
import ro.ase.csie.cts.simplefactory.WeaponType;
import ro.ase.csie.cts.simplefactory.WeaponsFactory;

public class TestFactoryMethod {

    public static void main(String[] args) {

        SuperHero superman = new SuperHero("Superman");
        boolean kidsMode = true;

        AbstractWeaponsFactory abstractFactory = null;
        if (kidsMode)
            abstractFactory = new WaterWeaponsFactory();
        else
            abstractFactory = new RealWeaponsFactory();

        AbstractWeapon bazooka = abstractFactory.getWeapon(WeaponType.BAZOOKA, "Boom");
        superman.setWeapon(bazooka);

        superman.setWeapon(abstractFactory.getWeapon(WeaponType.MACHINEGUN, "MG"));
    }
}
