package ro.ase.csie.cts.course12.observer;

public interface NetworkEventHandler {

    public void notifyNetworkDown();
    public void notifyNetworkUp();
}
