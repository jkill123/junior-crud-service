package basic.patterns.observer;

public class Main {

    public static void main(String[] args) {
        PostOffice postOffice = new PostOffice();

        Human bob = new Human();
        Human alice = new Human();
        Robot robot = new Robot();

        postOffice.registerClient(bob);
        postOffice.registerClient(alice);
        postOffice.registerClient(robot);

        postOffice.postNewsPaper("Fresh news");
    }
}
