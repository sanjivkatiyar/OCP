package ocp.java._06.concurrency;

public class C82Deadlock {
    public static void main(String[] args) {
        go();
    }

    public static void go(){

        final String ransom = "ransom";
        final String hostage = "hostage";

        Thread criminals = new Thread(()->{
           synchronized (hostage){
               System.out.println("The criminals have the hostage and want the ransom...");
               try {
                   Thread.sleep(500);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               synchronized (ransom){
                   System.out.println("Criminals have both!");
               }
           }
        });

        Thread police = new Thread(()->{
            synchronized (ransom) {
                System.out.println("The police have the ransom and want the hostage...");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (hostage) {
                    System.out.println("Police have both!");
                }
            }
        });

        criminals.start();;
        police.start();
    }
}
