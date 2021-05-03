package composite;

public abstract class AbstractNode {
    public String name;

    public abstract void addNode(AbstractNode node);
    public abstract void removeNode(AbstractNode node);
    public abstract AbstractNode getNode(int index);

    public abstract void printName();
}
