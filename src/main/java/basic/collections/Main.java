package basic.collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> test = new ArrayList<>();

        test.add("first");
        test.add("first");
        test.add("second");
        test.add("second");
        test.add(null);
        test.add(null);
        test.add(1, "middle");

        Iterator<String> iterator = test.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
//
//        System.out.println(test);

//        String s = test.get(2);
//        System.out.println(s);

//        test.remove("second");
//
//        System.out.println(test);
//
//        test.remove(1);
//        System.out.println(test);
//
//        test.removeIf(s -> s.startsWith("se"));
//        System.out.println(test);
//
//        boolean empty = test.isEmpty();
//        test.forEach(s -> System.out.println(s));

//        for (String name : test) {
//            System.out.println(name);
//        }

//        test.removeIf(name -> name.length() < 5);
//
//        for (int i = 0; i < 1; i++) {
//            String name = test.get(i);
//            System.out.println(name);
//        }

        List<String> names = new LinkedList<>();
        names.add("first");
        names.add("second");

        System.out.println(names);

        ListIterator<String> listIterator = names.listIterator();
        boolean hp = listIterator.hasPrevious();
    }
}
