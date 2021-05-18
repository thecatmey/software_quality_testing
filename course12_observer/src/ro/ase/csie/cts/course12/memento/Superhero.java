package ro.ase.csie.cts.course12.memento;

public class Superhero {

    String name;
    int lifePoints;
    String magic;

    public Superhero(String name, int lifePoints, String magic) {
        this.name = name;
        this.lifePoints = lifePoints;
        this.magic = magic;
    }

    public void attack(){
        System.out.println("Is attacking.");
    }

    public void heal(){
        System.out.println("Is healing.");
    }

    public void move(){
        System.out.println("Is moving.");
    }

    public HeroRestorePoint saveData(){
        return new HeroRestorePoint(this.name, this.lifePoints, this.magic);
    }

    public void restoreData(HeroRestorePoint memento){
        this.name = memento.name;
        this.lifePoints = memento.lifePoints;
        //how to handle private memento classes
        this.magic = memento.getMagic();
    }
}
