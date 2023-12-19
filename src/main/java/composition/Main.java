package composition;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("Peremogy");
        UserAggr userAggr = new UserAggr(22, "Bob", address);

        UserCom userCom = new UserCom(22, "Bob", "Peremogy");
        Address userComAddress = userCom.getAddress();
    }
}
