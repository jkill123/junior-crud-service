package basic.factory;

public class Main {
    public static void main(String[] args) {
        CarFactory factory = new CarFactory();
        Car bmw = factory.getCar(CarBrand.BMW);
        Car bmw2 = factory.getCar(CarBrand.BMW);
        Car ford = factory.getCar(CarBrand.FORD);
        bmw.drive();
        bmw2.drive();
        ford.drive();

        //todo why we ned this? why just not create from new?
        // 1 same behaviour by impl some interface
        // 2 create object may take many code lines
    }
}
