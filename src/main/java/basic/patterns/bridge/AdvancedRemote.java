package basic.patterns.bridge;

public class AdvancedRemote extends RemoteControl{

    public AdvancedRemote(Tv tv) {
        super(tv);
    }

    @Override
    public void turnOn() {
        System.out.println("welcome sound");
        tv.on();
    }

    @Override
    public void turnOff() {
        System.out.println("buy buy sound");
        tv.off();
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("channel switch sound");
        tv.setChannel(channel);
    }

    public void downloadApp() {
        SamsungTv samsungTv = (SamsungTv) tv;
        ((SamsungTv) tv).downloadApk();
    }
}
