package com.company.juniorcrudservice.concurency;

public class MyThread extends Thread{

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("why you wake me up?");
        }
        System.out.println("keep working");
    }
}
