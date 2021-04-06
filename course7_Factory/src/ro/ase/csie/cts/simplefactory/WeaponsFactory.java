package ro.ase.csie.cts.simplefactory;

public class WeaponsFactory {

    public static AbstractWeapon getWeapon(WeaponType type, String desc){
        // desc argument is optional, will have to be defined for all weapons
        AbstractWeapon weapon = null;
        switch (type){
            case PISTOL:
                weapon = new Pistol (desc, 100);
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
