package composition;

public class Main {
    public static void main(String[] args) {
//        Address address = new Address("Peremogy");
//        UserAggr userAggr = new UserAggr(22, "Bob", address);
//
//        System.out.println(userAggr.getAddress().getStreet());
//        address.setStreet("Khershatyk");
//        System.out.println(userAggr.getAddress().getStreet());
//
        UserCom userCom = new UserCom(22, "Bob", "Peremogy");
        Address userComAddress = userCom.getAddress();
    }
}
