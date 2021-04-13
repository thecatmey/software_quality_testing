package ro.ase.csie.cts.course8.adapter.disney;

public interface DisneyActions {

    public abstract void changeLocation(int x, int y);
    public abstract void isWounded(int lostLifePoints);
    public abstract void isHealed (int recoveredPoints);

    public abstract String getName();
    public abstract int getPower();
}
