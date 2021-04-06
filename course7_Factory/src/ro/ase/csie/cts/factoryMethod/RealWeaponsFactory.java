package ro.ase.csie.cts.factoryMethod;

import ro.ase.csie.cts.simplefactory.*;

public class RealWeaponsFactory extends AbstractWeaponsFactory{

    @Override
    public AbstractWeapon getWeapon(WeaponType type, String desc) {
        AbstractWeapon weapon = null;
        switch (type){
            case PISTOL:
                weapon = new Pistol(desc, 100);
                break;
            case MACHINEGUN:
                weapon = new MachineGun(desc, 500, 100);
                break;
            case BAZOOKA:
                weapon = new Bazooka(desc);
                break;
            default:
                throw new UnsupportedOperationException();
        }

        return weapon;
    }
}
