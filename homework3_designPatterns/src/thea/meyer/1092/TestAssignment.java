import composite.AbstractNode;
import composite.Group;
import decorator.AbstractPizza;
import decorator.BasicPizza;
import decorator.CheeseDecorator;
import decorator.SalamiDecorator;

public class TestAssignment {

    public static void main(String[] args) {

        // Test for Decorator
        AbstractPizza boring = new BasicPizza("Basic", true);
        System.out.println(boring.description);
        System.out.println(boring.getPrice());

        AbstractPizza cheesy = new CheeseDecorator(boring);
        System.out.println(cheesy.description);
        System.out.println(cheesy.getPrice());

        AbstractPizza meatNCheese = new SalamiDecorator(cheesy);
        System.out.println(meatNCheese.description);
        System.out.println(meatNCheese.getPrice());

        //Test for Composite
        AbstractNode dishType = new Group("Dish type");
        AbstractNode appetizer = new Group("Appetizer");
        AbstractNode mainDish = new Group("Main Dish");
        AbstractNode dessert = new Group("Dessert");

        dishType.addNode(appetizer);
        dishType.addNode(mainDish);
        dishType.addNode(dessert);

        AbstractNode pasta = new Group("Pasta");
        AbstractNode pizza = new Group("Pizza");

        mainDish.addNode(pasta);
        mainDish.addNode(pizza);

        pizza.addNode(boring);
        pizza.addNode(cheesy);
        pizza.addNode(meatNCheese);

        dishType.printName();
        mainDish.printName();
        pizza.printName();

    }
}
