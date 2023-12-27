package basic.generics;

public class Book<T> {

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "Book{" +
                "t=" + t +
                '}';
    }
}
