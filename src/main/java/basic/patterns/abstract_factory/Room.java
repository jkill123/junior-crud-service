package basic.patterns.abstract_factory;

public class Room {

    private Chair chair;
    private Sofa sofa;
    private CoffeeTable coffeeTable;

    public Room(FurnitureFactory factory) {
        this.chair = factory.getChair();
        this.sofa = factory.getSofa();
        this.coffeeTable = factory.getCoffeeTable();
    }
}
