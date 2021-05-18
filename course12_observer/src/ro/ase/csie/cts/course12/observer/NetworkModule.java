package ro.ase.csie.cts.course12.observer;

import java.util.ArrayList;
import java.util.List;

public class NetworkModule {

    // list of observers
    List<NetworkEventHandler> modules = new ArrayList<>();

    //subscribe
    public void registerModule(NetworkEventHandler module){
        modules.add(module);
    }

    //unsubscribe
    public void unregisterModule(NetworkEventHandler module){
        modules.remove(module);
    }

    //notify observer
    public void networkStatusChanged(NetworkStatus status){
        if(status == NetworkStatus.UP){
            for(NetworkEventHandler module: modules){
                module.notifyNetworkUp();
            }
        }

        if (status == NetworkStatus.DOWN){
            for(NetworkEventHandler module: modules){
                module.notifyNetworkDown();
            }
        }

    }

}
