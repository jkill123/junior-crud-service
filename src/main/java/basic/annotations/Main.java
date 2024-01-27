package basic.annotations;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        FibExample fibExample = new FibExample();

        Method method = fibExample.getClass().getMethod("iterativeFib", long.class);

        if (method.isAnnotationPresent(Benchmark.class)) {
            long startTime = System.currentTimeMillis();

            method.invoke(fibExample, 2000000000L);

            long endTime = System.currentTimeMillis();
            long duration = endTime - startTime;

            System.out.println("Execution time: " + duration + " mil");
        }
    }
}
