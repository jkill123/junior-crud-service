package com.company.juniorcrudservice.concurency;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

//    private static volatile int counter = 1;
//    private static volatile AtomicInteger counter2 = null;

    public static void main(String[] args) throws IOException, InterruptedException {
        //todo
        // 1. extend thread class and imp method or use lambda
        // 2 iml runnable interface
        // 3 iml callable interface
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("why you wake me up?");
            }

            System.out.println("keep working");
        });

        thread.start();
//        thread.join();
//        thread.setDaemon(true);
//        thread.isDaemon();
//        thread.interrupt();
//        thread.setPriority(1000000);
        System.out.println(thread.getPriority());
        System.out.println("main thread in progress");

        //deadlock, livelock, starvation, race condition
        //deadlock, race condition

    }

//    public static synchronized void logStuff() {
//        // access to bank account amount variable
//        System.out.println("efefef");
//    }

    List<Integer> syncList = Collections.synchronizedList(new ArrayList<>());
}
