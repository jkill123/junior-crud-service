package basic.patterns.observer;

public class Human implements Receiver{
    @Override
    public void receive(String s) {
        System.out.println("reading newspaper");
    }
}
