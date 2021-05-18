package ro.ase.csie.cts.course12.observer;

public class UINotificationsModule implements NetworkEventHandler{

    @Override
    public void notifyNetworkDown() {
        System.out.println("Notify player: Network lost.");
    }

    @Override
    public void notifyNetworkUp() {
        System.out.println("Notify player: Network connection running.");
    }
}
