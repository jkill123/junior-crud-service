package basic.factory;

public class CarFactory {

    public Car getCar(CarBrand brand) {
        switch (brand) {
            case BMW: return new Bmw();
            case FORD: return new Ford();
            default: return new Bmw();
        }
    }
}
