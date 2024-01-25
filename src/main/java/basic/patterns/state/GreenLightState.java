package basic.patterns.state;

public class GreenLightState implements TrafficLightState{
    @Override
    public void action(TrafficLightContext context) {
        System.out.println("green now");
        context.setState(new YellowLightState());
    }
}
