package ro.ase.csie.cts.simplefactory;

public class Bazooka extends AbstractWeapon {

    public Bazooka(String desc) {
        description = desc;
        this.powerLevel = 1000;
    }

    @Override
    public void pewPew() {
        System.out.println("BOOOOOM *****************");
    }
}
