package basic.patterns.bridge;

public class SonyTv implements Tv{
    @Override
    public void on() {
        System.out.println("sony on");
    }

    @Override
    public void off() {
        System.out.println("sony off");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("sony tune channel to: " + channel);
    }
}
