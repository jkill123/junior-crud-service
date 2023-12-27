package basic.concurency;

public class MyThreadRunnable implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("why you wake me up?");
        }
        System.out.println("keep working");
    }
}
