package ocp.java._06.concurrency;

public class C64UsingLamdaAsRunnable {
    public static void main(String[] args) {
        Thread t = new Thread(()-> System.out.println("run(): " + Thread.currentThread().getName()));

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("run(): " + Thread.currentThread().getName());
            }
        });
        t.start();

        t1.start();

        t.run();
        System.out.println("main(): " + Thread.currentThread().getName());
    }
}
