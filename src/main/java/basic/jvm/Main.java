package basic.jvm;

public class Main {
    public static void main(String[] args) {
        //todo jvm 30 years in development, min bugs - high quality (enterprise, quality)
        // 2 other languages using JVM (scala, kotlin, groovy etc)
        // 3 JVM bytecode -> machine code
        // 4 first run: source -> javac -> interpreter -> machineCode
        // 5 if some piece of code sing frequently -  jmv using jit compiler (kinda caching for hot code)
        // 6 JRE gone
        // 7 imports for classloaders


        //todo other methods


        int counter = 100;
        while (counter > 0) {
            Integer random = 10;
            pinter(random);
        }
    }

    public static void pinter(Integer val) {
        System.out.println("Our number is: " + val);
    }
}
