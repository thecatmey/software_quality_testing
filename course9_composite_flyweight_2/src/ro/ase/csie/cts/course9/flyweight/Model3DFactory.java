package ro.ase.csie.cts.course9.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Model3DFactory {
    static Map<String, Model3DFlyweightInterface> models = new HashMap<>();

    static {
        models.put(ModelType.SOLDIER.toString(), new Model3DFlyweight());
        models.put(ModelType.LEVEL_BOSS.toString(), new Model3DFlyweight());
    }

    static Model3DFlyweightInterface getModel(ModelType type){
        return models.get(type.toString());
    }

}
