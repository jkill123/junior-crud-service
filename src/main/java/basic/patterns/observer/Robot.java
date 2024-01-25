package basic.patterns.observer;

public class Robot implements Receiver{
    @Override
    public void receive(String s) {
        System.out.println("scaning newspaper");
    }
}
