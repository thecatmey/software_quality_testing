package ro.ase.csie.cts.course12.observer;

public class TestObserver {

    public static void main(String[] args) {

        NetworkModule networkModule = new NetworkModule();

        NetworkEventHandler autoSave = new AutoSaveModule();
        NetworkEventHandler notifications = new UINotificationsModule();

        networkModule.networkStatusChanged(NetworkStatus.UP);

        networkModule.registerModule(autoSave);
        networkModule.registerModule(notifications);

        networkModule.networkStatusChanged(NetworkStatus.UP);

        networkModule.unregisterModule(autoSave);

        networkModule.networkStatusChanged(NetworkStatus.DOWN);
    }
}
