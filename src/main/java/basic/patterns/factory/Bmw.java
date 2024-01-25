package basic.patterns.factory;

public class Bmw implements Car{
    @Override
    public void start() {
        System.out.println("Bmw start");
    }

    @Override
    public void stop() {
        System.out.println("Bmw stop");
    }

    @Override
    public void drive() {
        System.out.println("Bmw drive");
    }
}
