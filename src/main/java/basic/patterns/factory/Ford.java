package basic.patterns.factory;

public class Ford implements Car{
    @Override
    public void start() {
        System.out.println("Ford start");
    }

    @Override
    public void stop() {
        System.out.println("Ford stop");
    }

    @Override
    public void drive() {
        System.out.println("Ford drive");
    }
}
