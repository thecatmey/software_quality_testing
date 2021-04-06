package ro.ase.csie.cts.simplefactory;

public class MachineGun extends AbstractWeapon{

    int nrBullets;

    public MachineGun(String desc, int power, int ammo) {
        this.description = desc;
        this.powerLevel = power;
        //this.nrBullets = ammo;
    }

    @Override
    public void pewPew() {
        System.out.printf("Tac Tac Tac --------->");
    }
}
