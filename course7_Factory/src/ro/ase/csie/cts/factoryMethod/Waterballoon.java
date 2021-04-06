package ro.ase.csie.cts.factoryMethod;

import ro.ase.csie.cts.simplefactory.AbstractWeapon;

public class Waterballoon extends AbstractWeapon {

    public Waterballoon(String desc){
        this.description = desc;
    }

    @Override
    public void pewPew(){
        System.out.println("Splash");
    }

}
