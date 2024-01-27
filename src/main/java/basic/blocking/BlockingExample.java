package basic.blocking;

public class BlockingExample {
    //todo what is blocking system
    public static void main(String[] args) {
        System.out.println("hello");

        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("world");
    }
}
