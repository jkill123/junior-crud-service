package basic.patterns.abstract_factory.modern;

import basic.patterns.abstract_factory.Chair;
import basic.patterns.abstract_factory.CoffeeTable;
import basic.patterns.abstract_factory.FurnitureFactory;
import basic.patterns.abstract_factory.Sofa;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair getChair() {
        return new ModernChair();
    }

    @Override
    public Sofa getSofa() {
        return new ModernSofa();
    }

    @Override
    public CoffeeTable getCoffeeTable() {
        return new ModernCoffeeTable();
    }
}
