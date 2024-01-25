package basic.patterns.state;

public class TrafficLightContext {

    private TrafficLightState state;

    public TrafficLightContext() {
        this.state = new RedLightState();
    }

    public void setState(TrafficLightState state) {
        this.state = state;
    }

    public void changeState() {
        state.action(this);
    }
}
