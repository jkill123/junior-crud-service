package map_inner_cl;

import com.company.juniorcrudservice.dto.EmployeeDto;
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StreamUtils;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Collections.emptyList;
import static org.apache.commons.lang3.StringUtils.EMPTY;
import static org.springframework.util.CollectionUtils.isEmpty;

public class Main {

    class Inner {
        // Method to display a message
        public void display() {
            System.out.println("Inner class");
        }
    }
    static class StaticInner {
        // Method to display a message
        public void display() {
            System.out.println("Inner class");
        }
    }

    public static void main(String[] args) {

        Main.Inner inner = new Main().new Inner();
        inner.display();

        StaticInner staticInner = new StaticInner();
        staticInner.display();


        //todo
        // 1 HashMap +
        // 2 Queue +
        // 3 Collections sort algos +
        // 4 inner classes
        // 5 Generics??? +

//        Map<String,String> treeTest = new TreeMap<>();
//        treeTest.put("o", "zero");
//
//        Map<String, String> names = new HashMap<>();
//        names.put("1", "Bob");
//        names.put("2", "Alice");
//        names.put("3", "Jhon");
//
//        EmployeeDto dto = new EmployeeDto();
//        Map<Integer, EmployeeDto> employeeDtoMap = new HashMap<>();
//        employeeDtoMap.put(dto.getId(), dto);
//
//
//        Queue<String> queue = new LinkedList<>();
//        // add elements to the queue
//        queue.add("apple");
//        queue.add("banana");
//        queue.add("cherry");
//
//        // print the queue
//        System.out.println("Queue: " + queue);
//
//        // remove the element at the front of the queue
//        String front = queue.remove();
//        System.out.println("Removed element: " + front);
////
////        // print the updated queue
////        System.out.println("Queue after removal: " + queue);
////
////        // add another element to the queue
////        queue.add("date");
////
//        // peek at the element at the front of the queue
//        String peeked = queue.peek();
//        System.out.println("Peeked element: " + peeked);
//
//        // print the updated queue
//        System.out.println("Queue after peek: " + queue);

        List<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(11);
        al.add(2);
        al.add(111);
        al.add(33);
        System.out.println(al);
        List<Integer> sorted = al.stream().sorted().collect(Collectors.toList());
        System.out.println(sorted);

        // java sort collections by default : merge sort algo
        // binary search
        // bubble search
        if (!isEmpty(sorted)) {
            //todo
        }
        String empty = EMPTY;
        int binarySearch = Collections.binarySearch(al, 10);
        int binarySearch1 = Collections.binarySearch(al, 10);


    }
}
