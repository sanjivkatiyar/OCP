package ocp.java._06.concurrency;

public class C73Synchronized {

    private int x;

    private void incrementA(){
        synchronized (this){
            x++;
        }
    }

    public synchronized void incrementB(){
        x++;
    }

    private static int y;

    public static void decrementA(){
        synchronized (C73Synchronized.class){
            y--;
        }
    }

    public static synchronized void decrementB(){
        y--;
    }

}
