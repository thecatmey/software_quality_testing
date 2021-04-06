package ro.ase.csie.cts.factoryMethod;

import ro.ase.csie.cts.simplefactory.AbstractWeapon;
import ro.ase.csie.cts.simplefactory.WeaponType;

public class WaterWeaponsFactory extends AbstractWeaponsFactory{

    @Override
    public AbstractWeapon getWeapon(WeaponType type, String desc) {
        AbstractWeapon weapon = null;
        switch(type){
            case BAZOOKA:
                weapon = new Waterballoon("Waterballoon");
                break;
            default:
                throw new UnsupportedOperationException("Not implemented");
        }
        return weapon;
    }
}
