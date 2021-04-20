package ro.ase.csie.cts.course9.flyweight;

import java.util.ArrayList;
import java.util.List;

public class TestFlyweight {
    public static void main(String[] args) {
        List<NPCCordinates> soldiers = new ArrayList<>();
        soldiers.add(new NPCCordinates(10, 10, 10, "Red"));
        soldiers.add(new NPCCordinates(50, 10, 10, "Green"));
        soldiers.add(new NPCCordinates(100, 100, 10, "Yellow"));

        Model3DFlyweightInterface soldierModel = Model3DFactory.getModel(ModelType.SOLDIER);

        for (NPCCordinates soldierCoord: soldiers){
            soldierModel.display(soldierCoord);
        }
    }
}
