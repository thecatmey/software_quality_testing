package ro.ase.csie.cts.course9.flyweight;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Model3DFlyweight implements Model3DFlyweightInterface{

    //shared Data
    String modelName;
    ArrayList<Integer> points = new ArrayList<>();
    //List<Integer> he wanted to use this but how and why?


    @Override
    public void loadModel(String filename) {

    }

    @Override
    public void display(NPCCordinates coordinates) {
        System.out.println(String.format("%s moves to x: %d, y: %d, z: %d",
                coordinates.colour, coordinates.x, coordinates.y, coordinates.z));
    }
}
