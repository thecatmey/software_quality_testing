package ro.ase.csie.cts.factoryMethod;

import ro.ase.csie.cts.simplefactory.AbstractWeapon;
import ro.ase.csie.cts.simplefactory.WeaponType;
import ro.ase.csie.cts.simplefactory.WeaponsFactory;

public abstract class AbstractWeaponsFactory {

    public abstract AbstractWeapon getWeapon(WeaponType type, String desc);
}
