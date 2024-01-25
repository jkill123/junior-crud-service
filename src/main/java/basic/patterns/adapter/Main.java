package basic.patterns.adapter;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Bike bike = new BikeAdapter(new Car());
        Bike bike1 = new Bike();
        bike.drive();
        bike1.drive();
    }
}
