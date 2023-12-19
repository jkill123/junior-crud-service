package solid.S.bad;

import solid.S.Car;
import solid.S.Client;
import solid.S.Order;

public class RentCarService {

    //todo S – Single Responsibility Principle – принцип єдиної відповідальності.
    // Кожен клас повинен мати лише одну зону відповідальності.

    public Car findCar(String carNo) {
        //find car by number
        Car car = new Car();
        return car;
    }

    public Order orderCar(String carNo, Client client) {
        //client order car
        Order order = new Order();
        return order;
    }

    public void printOrder(Order order) {
        //print order
    }
    public void getCarInterestInfo(String carType) {
        if (carType.equals("sedan")) {
            //do some job
        }
        if (carType.equals("pickup")) {
            //do some job
        }
        if (carType.equals("van")) {
            //do some job
        }
    }
    public void sendMessage(String typeMessage, String message) {
        if (typeMessage.equals("email")) {
            //write email
            //use JavaMailSenderAPI
        }
    }
}
