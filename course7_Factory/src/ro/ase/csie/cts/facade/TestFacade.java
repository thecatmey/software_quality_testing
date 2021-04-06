package ro.ase.csie.cts.facade;

public class TestFacade {

    public static void main(String[] args) {
        //in order to connect to the game from an external app you need to
        //1. Create player profile and login

        PlayerProfile profile = new PlayerProfile();
        profile.login();
        profile.getUserSettings();

        //2. Check Subscription
        Subscription subscription = new Subscription();
        subscription.checkSubscription();

        // using the facade combines step 1 and 2
        GameAPIFacade.createProfileAndConnect();

        //3.Get main character
        SuperHero superHero = new SuperHero("Superman", new Helmet(), new SuperPower());
    }
}
