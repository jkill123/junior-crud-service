package basic.lambda;

import basic.composition.Address;
import basic.composition.UserAggr;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.*;

import static java.util.Objects.nonNull;

public class Main {
    public static void main(String[] args) {

        //todo lambda and custom functional interface

        Operational operation;
        operation = (x, y) -> x + y;

//        int result = operation.calculate(10, 20);
//        System.out.println(result); //30


//        Operational operation1 = (int x, int y)-> x + y;
//        Operational operation2 = (int x, int y)-> x - y;
//        Operational operation3 = (int x, int y)-> x * y;
//
//        System.out.println(operation1.calculate(20, 10)); //30
//        System.out.println(operation2.calculate(20, 10)); //10
//        System.out.println(operation3.calculate(20, 10)); //200

        //todo 1 functional interface
//        Function<String, Integer> func = name -> name.length();
//
//        Integer bob = func.apply("Bob");
//        System.out.println(bob);

        //todo 2 predicate
//        Predicate<Integer> isBiggerThan10 = number -> number > 10;
//
//        System.out.println(isBiggerThan10.test(20));

        // todo consumer
//        Consumer<Integer> printer = number -> System.out.println(number);
//        printer.accept(33);
//        List<Integer> numbers = List.of(11, 12, 13, 14);
//        numbers.forEach(printer);

        //todo supplier
//        Supplier<Double> random = () -> Math.random();
//
//        Double result = random.get();
//        System.out.println(result);

        // todo binary operator
//        BinaryOperator<Integer> multiply = (x, y) -> x * y;
//
//        System.out.println(multiply.apply(2,2));
//        System.out.println(multiply.apply(10,-2));

        // todo unary operator
//        UnaryOperator<Integer> square = x -> x * x;
//        System.out.println(square.apply(4));

//        //todo Optional
        Address address = new Address("Peremogy");
        Address address2 = null;
        UserAggr user = new UserAggr(22, "Bob", address);

//        System.out.println(user.getAddress().getStreet());

//        if (user.getAddress() != null && nonNull(user.getAddress())) {
//            System.out.println(user.getAddress().getStreet());
//        }
//
        Optional<UserAggr> optionalUser = Optional.ofNullable(user);

//        UserAggr userAggr = optionalUser.get();

//        boolean present = optionalUser.isPresent();

//        Address address3 = optionalUser
//                .map(userAggr -> userAggr.getAddress())
//                .filter(addr -> addr.getStreet().equals("bob"))
//                .orElseThrow();
//
//
//        System.out.println(address3);

//        optionalUser
//                .map(usr -> usr.getAddress())
//                .map(address1 -> "Street: " + address1.getStreet())
//                .ifPresent(street -> System.out.println(street));
//
        optionalUser
                .map(usr -> usr.getAddress())
                .map(address1 -> "Street: " + address1.getStreet())
                .ifPresent(System.out::println);
//
//        //todo method reference

        Function<String, String> isStatsWith = Main::startsWith;
        String result = isStatsWith.apply("Jungle");
        System.out.println(result);
    }

    public static String startsWith(String s) {
        return String.valueOf(s.charAt(0));
    }
}
