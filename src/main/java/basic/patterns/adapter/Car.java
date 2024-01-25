package basic.patterns.adapter;

public class Car {

    private void startEngine() {
        System.out.println("start engine");
    }

    public void drive() {
        startEngine();
        System.out.println("car drive");
    }
}
