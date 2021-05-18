package ro.ase.csie.cts.course12.memento;

import java.util.ArrayList;
import java.util.List;

public class RestorePointsManager {

    List<HeroRestorePoint> restorePoints = new ArrayList<>();

    public void addRestorePoint(HeroRestorePoint point){
        restorePoints.add(point);
    }

    public HeroRestorePoint getRestorePoint(int index){
        if(index < 0 || index >= restorePoints.size()){
            throw new UnsupportedOperationException();
        }else{
            HeroRestorePoint point = restorePoints.get(index);
            restorePoints.remove(index);
            return point;
        }

    }
}
