package basic.annotations;

public class FibExample {

    @Benchmark
    public static long iterativeFib(long n) {
        if (n <= 1) {
            return n;
        }
        int fib = 1;
        int prevFib = 1;

        for (int i =2; i < n; i++) {
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
        }
        return fib;
    }

    @Benchmark
    public static long recursiveFib(long n) {
        if (n <= 1) {
            return n;
        }

        return recursiveFib(n - 1) + recursiveFib(n - 2);
    }
}
