package basic.patterns.adapter;

import basic.patterns.adapter.Car;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BikeAdapter extends Bike{

    private final Car car;

    @Override
    public void drive() {
        car.drive();
    }
}
