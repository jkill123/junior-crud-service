package basic.patterns.bridge;

public class Main {

    public static void main(String[] args) {
        Tv sonyTv = new SonyTv();
        Tv samsungTv = new SamsungTv();
        RemoteControl basicRemote = new BasicRemote(sonyTv);
        RemoteControl basicRemote2 = new BasicRemote(samsungTv);
        AdvancedRemote advance = new AdvancedRemote(samsungTv);
        basicRemote.turnOn();
        advance.turnOn();
        advance.downloadApp();
    }
}
