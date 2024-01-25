package basic.patterns.abstract_factory;

import basic.patterns.abstract_factory.artdeco.ArtDecoFurnitureFactory;
import basic.patterns.abstract_factory.modern.ModernFurnitureFactory;

public class Main {

    public static void main(String[] args) {
        Room artDeco = new Room(new ArtDecoFurnitureFactory());
        Room modernRoom = new Room(new ModernFurnitureFactory());
    }
}
