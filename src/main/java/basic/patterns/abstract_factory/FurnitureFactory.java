package basic.patterns.abstract_factory;

public interface FurnitureFactory {

    Chair getChair();
    Sofa getSofa();
    CoffeeTable getCoffeeTable();
}
