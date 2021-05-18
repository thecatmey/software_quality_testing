package ro.ase.csie.cts.course12.observer;

public class AutoSaveModule implements NetworkEventHandler{

    @Override
    public void notifyNetworkDown() {
        System.out.println("Saving player data...");
    }

    @Override
    public void notifyNetworkUp() {
        System.out.println("Ask player to restore data...");
    }
}
