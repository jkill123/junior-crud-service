package generics;

import com.company.juniorcrudservice.dto.order.OrderDto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        OrderDto orderDto = new OrderDto();
        orderDto.setId(111);
        orderDto.setCost(11.1);
        orderDto.setDate(LocalDate.now());

        OrderDto build = OrderDto.builder()
                .id(111)
                .cost(11.1)
                .date(LocalDate.now())
                .products(new ArrayList<>())
                .build();

        OrderDto build1 = OrderDto.builder()
                .id(111)
                .cost(11.1)
                .build();

        OrderDto build2 = OrderDto.builder()
                .id(111)
                .products(new ArrayList<>())
                .build();
        //todo generic problem

        //row type init (used until java 5)
//        List list = new LinkedList();
        // to not break old func - they left row type and added Generics
//        List<Integer> list = new LinkedList<>();
//        list.add(new Integer(111));
//
//        // if no type - we dunno how to iterate
//        Integer i = list.iterator().next();
//        System.out.println(i);


//        //todo generic methods
//        String[] people = {"Tom", "Alice", "Sam", "Kate", "Bob", "Helen"};
//        Integer[] numbers = {23, 4, 5, 2, 13, 456, 4};
//        print(people);
//        print(numbers);
//
//
//        //todo generic on class and interfaces fields
//        Book<Integer> book = new Book<>();
//        book.setT(555);
//        System.out.println(book);
//
//        //todo extends and super
        List<? extends Number> foo1 = new ArrayList<Number>();  // Number its Number
        List<? extends Number> foo2 = new ArrayList<Integer>(); // Integer extends Number
        List<? extends Number> foo3 = new ArrayList<Double>();  // Double extends Number

        List<? super Integer> boo1 = new ArrayList<Integer>(); // Integer its Number
        List<? super Integer> boo2 = new ArrayList<Number>();  // Number is a super class of Integer
        List<? super Integer> boo3 = new ArrayList<Object>();  // Object is a super class of Integer
    }

    //todo 1 generic methods
    public static <T> void print(T[] items){
        for(T item: items){
            System.out.println(item);
        }
    }
}
