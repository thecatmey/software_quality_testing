package composite;

public class Dish extends AbstractNode{

    public boolean vegetarian;
    public String description;

    public Dish(String name, boolean vegetarian, String description) {
        super.name = name;
        this.vegetarian = vegetarian;
        this.description = description;
    }

    @Override
    public void addNode(AbstractNode node) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void removeNode(AbstractNode node) {
        throw new UnsupportedOperationException();
    }

    @Override
    public AbstractNode getNode(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void printName() {
        System.out.println(this.name);
    }
}
