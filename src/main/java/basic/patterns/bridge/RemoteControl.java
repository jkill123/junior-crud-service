package basic.patterns.bridge;

public abstract class RemoteControl {

    protected Tv tv;

    public RemoteControl(Tv tv) {
        this.tv = tv;
    }
    public abstract void turnOn();
    public abstract void turnOff();
    public abstract void setChannel(int channel);
}
