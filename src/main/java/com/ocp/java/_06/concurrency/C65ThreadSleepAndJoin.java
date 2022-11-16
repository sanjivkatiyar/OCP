package com.ocp.java._06.concurrency;

public class C65ThreadSleepAndJoin {
    public static void main(String[] args) {
        Thread timer = new Thread(new CountDown());
        System.out.println("Starting 10 second count down... ");
        timer.start();
        try {
            timer.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Boom!!!");
    }
}

class CountDown implements Runnable{
    String[] timeStr = {"Zero", "One", "Two", "Three", "Four", "Five",
    "Six", "Seven", "Eight", "Nine", "Ten"};

    @Override
    public void run() {
        for(int i = 9; i >= 0; i--){
            try{
                System.out.println(timeStr[i]);
                Thread.sleep(1000);
            } catch (InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }
}
