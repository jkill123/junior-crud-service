package basic.patterns.state;

public class RedLightState implements TrafficLightState{
    @Override
    public void action(TrafficLightContext context) {
        System.out.println("red now");
        context.setState(new GreenLightState());
    }
}
