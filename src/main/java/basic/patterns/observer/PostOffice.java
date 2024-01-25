package basic.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class PostOffice {

    private final List<Receiver> receivers;

    public PostOffice() {
        this.receivers = new ArrayList<>();
    }

    public void registerClient(Receiver receiver) {
        receivers.add(receiver);
    }

    public void postNewsPaper(String string) {
        System.out.println("new stuff coming");
        receivers.forEach(s -> s.receive(string));
    }
}
