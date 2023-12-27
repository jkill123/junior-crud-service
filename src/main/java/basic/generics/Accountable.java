package basic.generics;

interface Accountable<T> {
    T getId();

    int getSum();

    void setSum(int sum);
}
