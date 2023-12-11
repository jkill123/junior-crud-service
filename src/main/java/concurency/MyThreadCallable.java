package concurency;

import java.util.concurrent.Callable;

public class MyThreadCallable implements Callable {

    @Override
    public Object call() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("why you wake me up?");
        }
        System.out.println("keep working");
        return null;
    }
}
