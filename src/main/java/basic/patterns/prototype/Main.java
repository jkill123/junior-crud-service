package basic.patterns.prototype;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Car mustang = new Car("Ford", "Mustang", 60000, new Engine());
        Car clone = mustang.clone();

        System.out.println(mustang.equals(clone));
        System.out.println(mustang == clone);
        System.out.println(mustang.getEngine() == clone.getEngine());

    }
}
