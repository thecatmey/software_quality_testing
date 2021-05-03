package composite;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Group extends AbstractNode{

    public ArrayList<AbstractNode> nodes = new ArrayList<>();

    public Group(String groupName) {
        super.name = groupName;
    }

    @Override
    public void addNode(AbstractNode node) {
        nodes.add(node);
    }

    @Override
    public void removeNode(AbstractNode node) {
        nodes.remove(node);
    }

    @Override
    public AbstractNode getNode(int index) {
        return nodes.get(index);
    }

    @Override
    public void printName() {
        for (AbstractNode node: nodes){
            System.out.println(node.name);
        }

    }
}
