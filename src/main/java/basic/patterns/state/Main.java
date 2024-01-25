package basic.patterns.state;

public class Main {

    public static void main(String[] args) {
        TrafficLightContext context = new TrafficLightContext();

        context.changeState();
        context.changeState();
        context.changeState();
        context.changeState();
    }
}
