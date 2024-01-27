package basic.blocking;

public class NonBlockingExample {
    public static void main(String[] args) {
        System.out.println("hello");

        new Thread(() -> {
            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Separate thread doing some stuff");
        }).start();

        System.out.println("world");
    }
}
