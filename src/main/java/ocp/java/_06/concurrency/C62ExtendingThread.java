package ocp.java._06.concurrency;

public class C62ExtendingThread {
    public static void main(String[] args) {
        new MyThread().start();
        //new MyThread().run();
        System.out.println("main() " + Thread.currentThread().getName());
    }
}

class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("run(): " + getName());
    }
}
