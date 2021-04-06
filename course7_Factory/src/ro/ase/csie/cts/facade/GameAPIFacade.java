package ro.ase.csie.cts.facade;

public class GameAPIFacade {

    public static void createProfileAndConnect(){
        PlayerProfile profile = new PlayerProfile();
        profile.login();
        profile.getUserSettings();

        Subscription subscription = new Subscription();
        subscription.checkSubscription();
    }
}
