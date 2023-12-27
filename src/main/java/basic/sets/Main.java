package basic.sets;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
//        Object object = new Object();
//        boolean equals = object.equals(new Object());
//        int hashCode = object.hashCode();
//        ArrayList<Object> persons = new ArrayList<>();
//        ArrayList<Object> countryIndexesList = new ArrayList<>();
//        EmployeeDto jhon = new EmployeeDto();
        Set<Student> guestList = new HashSet<>(9);
//        boolean contains = guestList.contains(jhon.getSurName());
//
//        jhon.setName("Alice");

////        countryIndexes.contains(new EmployeeDto("jonn"));
//        boolean contains = countryIndexes.contains(1); // todo O(1)

        //todo 1.Hash set швидкість пошуку елемету O(1)
        //todo 2.Hash % ост от ділення на розмір массиву(buckets) -> номер бакету -> add object
        //todo 2.Hash % get object -> found bucket by hash -> found object by equals -> result
        //todo 3.Hash if we adding always(override hash code == 1) elements with same hash? -> gonna be LinkedList O(n)
        //todo 3.Hash if we adding elements with same hash and equals -> ignore operation (no duplicates)



        // todo Immutability Java class:
        // todo 1
        //  1 The class must be declared as final so that child classes can’t be created.
        //  2 Data members in the class must be declared private so that direct access is not allowed.
        //  3 Data members in the class must be declared as final so that we can’t change the value of it after object creation.
        //  4 A parameterized constructor should initialize all the fields performing a deep copy so that data members can’t be modified with an object reference.
        //  5 Deep Copy of objects should be performed in the getter methods to return a copy rather than returning the actual object reference)
        //  6 Getters only, no setters to modify data inside object

        Set<Person> personSet = new TreeSet<>();
        personSet.add(new Person("bob", 22));
        personSet.add(new Person("allice", 1));
        personSet.add(new Person("allice2", 44));

//        Set<Integer> numbers = new TreeSet<>();
//        numbers.add(44);
//        numbers.add(1);
//        numbers.add(22);
//        numbers.add(5);
//        System.out.println(numbers);

        System.out.println(personSet);
//        Person person1 = new Person("bob", 23);
//        Person person2 = new Person("bob", 24);
//        int result = person1.compareTo(person2);
//        System.out.println(result);

    }
    //todo min or max O(log(n))
}

class Person implements Comparable<Person>{

    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person person) {
        return age.compareTo(person.getAge());
    }
}
