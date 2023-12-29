package basic.streams;

import basic.composition.Address;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {
        //todo streams:
        // 1 got from scala
        // 2 based on lambda
        // Once stream created, the stream instance will not modify its source

        // todo stream creation

//        Stream<String> streamEmpty = Stream.empty();
//        Stream<String> stringStream = Stream.of("zero", "one", "two");
//        Stream<String> streamBuilder = Stream.<String>builder().add("one").add("two").build();
//        streamBuilder.forEach(s -> System.out.println(s));

//        IntStream.range(1, 30).forEach(System.out::println);
//
//        List<String> numbers = List.of("zero", "one", "two", "two");
//        numbers.stream()
//                .filter(number -> number.length() > 2)
//                .sorted()
//                .forEach(System.out::println);

//        System.out.println(numbers);
//
//        numbers.stream()
//                .map(s -> s.length())
//                .forEach(System.out::println);
//
//
//
//        //todo two types if operations

        //todo practice

        List<Book> books = List.of(
        Book.builder().name("Garry Potter 1").author("Rowling").numberOfPages(600).build(),
        Book.builder().name("Garry Potter 2").author("Rowling").numberOfPages(700).build(),
        Book.builder().name("Garry Potter 2").author("Rowling").numberOfPages(700).build(),
        Book.builder().name("Garry Potter 2").author("Rowling").numberOfPages(700).build(),
        Book.builder().name("Garry Potter 2").author("Rowling").numberOfPages(700).build(),
        Book.builder().name("Garry Potter 3").author("Rowling").numberOfPages(1000).build(),
        Book.builder().name("Lord of the ring 1").author("Tolkien").numberOfPages(350).build(),
        Book.builder().name("Lord of the ring 2").author("Tolkien").numberOfPages(380).build(),
        Book.builder().name("Lord of the ring 3").author("Tolkien").numberOfPages(450).build()
        );

        //todo
//        books.stream()
//                .filter(book -> book.getNumberOfPages() > 500)
//                .peek(book -> System.out.println(book.getAuthor()))
//                .map(book -> book.getName() + " " + book.getNumberOfPages())
//                .forEach(System.out::println);

//        long totalBooks = books.stream()
//                .filter(book -> book.getNumberOfPages() > 500)
//                .distinct()
//                .peek(System.out::println)
//                .count();

//        System.out.println(totalBooks);

        // todo collector to map
//        Map<String, Integer> collected = books.stream()
//                .filter(book -> book.getNumberOfPages() > 500)
//                .distinct()
//                .collect(Collectors.toMap(Book::getName, Book::getNumberOfPages));

//        System.out.println(collected);


        //todo flatmap
//        List<Integer> primeNumbers = Arrays.asList(5, 7, 11,13);
//        List<Integer> oddNumbers = Arrays.asList(1, 3, 5);
//        List<Integer> evenNumbers = Arrays.asList(2, 4, 6, 8);
//
//        List<List<Integer>> listOfListofInts =
//                Arrays.asList(primeNumbers, oddNumbers, evenNumbers);
//
//        System.out.println("The Structure before flattening is : " +
//                listOfListofInts);
//
//        // Using flatMap for transformating and flattening.
//        List<Integer> listofInts  = listOfListofInts.stream()
//                .flatMap(list -> list.stream())
//                .collect(Collectors.toList());
//
//        System.out.println("The Structure after flattening is : " +
//                listofInts);


//        List<Human> humans = asList(
//                new Human("Sam", asList("Buddy", "Lucy")),
//                new Human("Bob", asList("Frankie", "Rosie")),
//                new Human("Marta", asList("Simba", "Tilly")));

//        List<String> petNames = new ArrayList<>();
//        for (Human human : humans) {
//            petNames.addAll(human.getPets());
//        }
//
//        List<String> petNames = humans.stream()
//                .map(human -> human.getPets())
//                .flatMap(pets -> pets.stream())
//                .sorted()
//                .collect(Collectors.toList());
//
//        System.out.println(petNames);


        //todo reduce
        // 1 form: Optional<T> reduce(BinaryOperator<T> accumulator)
        // 2 form: T reduce(T identity, BinaryOperator<T> accumulator)
        // 3 form: U reduce(U identity, BiFunction<U,? super T,U> accumulator, BinaryOperator<U> combiner)


        //todo example 1 form -> retunrn optional
        // Об'єкт BinaryOperator<T> є функцією, яка приймає два елементи і виконує над ними деяку операцію, повертаючи результат.
        // При цьому метод reduce зберігає результат і потім знову ж таки застосовує до цього результату і
        // наступного елемента в наборі бінарну операцію.

//        Stream<Integer> numbersStream = Stream.of(1, 2, 3, 4, 5, 6);
//        // 1 * 2 = 2
//        // 2 * 3 = 6
//        // 6 * 4 = 24
//        // 24 * 5 = xxx
//        // 24 * 5 = xxx
//        Optional<Integer> result = numbersStream.reduce((x, y) -> x * y);
//        System.out.println(result.get());


        //todo example 2 form ->
        // Друга версія методу reduce() приймає два параметри: T reduce(T identity, BinaryOperator<T> accumulator)
        // Перший параметр - T identity - елемент, який надає початкове значення для функції другого параметра,
        // а також надає значення за замовчуванням, якщо потік не має елементів.
        // Другий параметр - BinaryOperator<T> accumulator, як і перша форма методу reduce, є асоціативною функцією,
        // яка запускається для кожного елемента в потоці і приймає два параметри.
        // Перший параметр представляє проміжний результат функції, а другий параметр - наступний елемент потоку.
        // Тобто при першому виклику функція accumulator як перший параметр приймає значення identity,
        // а як другий параметр - перший елемент потоку.
        // При другому виклик першим параметром служить результат першого виклику функції accumulator,
        // а другим параметром - другий елемент у потоці і так далі. Наприклад:


//        Stream<Integer> numberStream = Stream.of(-4, 3, -2, 1);
//        int identity = 2;
//        // 2 * -4 = 8
//        // 8 * 3 = 24
//        // 24 * 2 = 48
//        // 48 * 1 = 48
//        int result = numberStream.reduce(identity, (x, y) -> x * y);
//        System.out.println(result);  // 48


        //todo example form 3 return diff type
        // І ми хочемо знайти суму цін тих телефонів, у яких ціна менша за певне значення.
        // Для цього використовуємо третю версію методу reduce:

//        Stream<Phone> phoneStream = Stream.of(
//                new Phone("iPhone 13", 54000),
//                new Phone("Lumia 950", 45000),
//                new Phone("Samsung S 10", 44000),
//                new Phone("LG G 10", 43000));
//
//        int sum = phoneStream.reduce(0,
//                (x, y) -> {
//                    if (y.getPrice() < 50000)
//                        return x + y.getPrice();
//                    else
//                        return x + 0;
//                },
//                (x, y) -> x + y);
//
//        System.out.println(sum);
    }
}
