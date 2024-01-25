package basic.patterns.state;

public class YellowLightState implements TrafficLightState{
    @Override
    public void action(TrafficLightContext context) {
        System.out.println("yellow now");
        context.setState(new RedLightState());
    }
}
