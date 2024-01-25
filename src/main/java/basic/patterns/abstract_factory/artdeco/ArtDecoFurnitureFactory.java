package basic.patterns.abstract_factory.artdeco;

import basic.patterns.abstract_factory.Chair;
import basic.patterns.abstract_factory.CoffeeTable;
import basic.patterns.abstract_factory.FurnitureFactory;
import basic.patterns.abstract_factory.Sofa;

public class ArtDecoFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair getChair() {
        return new ArtDecoChair();
    }

    @Override
    public Sofa getSofa() {
        return new ArtDecoSofa();
    }

    @Override
    public CoffeeTable getCoffeeTable() {
        return new ArtDecoCoffeeTable();
    }
}
