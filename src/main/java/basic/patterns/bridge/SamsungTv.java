package basic.patterns.bridge;

public class SamsungTv implements Tv{
    @Override
    public void on() {
        System.out.println("Samsung on");
    }

    @Override
    public void off() {
        System.out.println("Samsung off");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("Samsung tune channel to: " + channel);
    }

    public void downloadApk(){
        System.out.println("apk download");
    }
}
