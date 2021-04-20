package ro.ase.csie.cts.course9.composite;

public class TestComposite {
    public static void main(String[] args) {

        AbstractNode group1 = new Group("Red team");
        group1.addNode(new NPCCharacter("Soldier1", 100));
        group1.addNode(new NPCCharacter("Soldier2", 100));

        AbstractNode group2 = new Group("Blue team");
        group2.addNode(new NPCCharacter("Soldier3", 100));
        group2.addNode(new NPCCharacter("DemolitionTeam", 300));

        AbstractNode levelGroup = new Group("Level2");
        levelGroup.addNode(new NPCCharacter("LevelBoss", 500));
        levelGroup.addNode(group1);
        levelGroup.addNode(group2);

        levelGroup.attack("Superman");
        levelGroup.retreat();
        levelGroup.getNode(0).move();

    }
}
