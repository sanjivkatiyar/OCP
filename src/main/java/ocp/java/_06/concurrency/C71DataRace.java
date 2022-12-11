package ocp.java._06.concurrency;

public class C71DataRace {

    public static int count = 0;

    public static void addToCounter(){

        int c = count;
        System.out.println("Before. " + count + ". Thread id: " + Thread.currentThread().getId());
        count = c + 1;
        System.out.println("After. " + count + ". Thread id: " + Thread.currentThread().getId());
    }

    public static void main(String[] args) {
        for(int i=1; i<=10; i++){
            new Thread(C71DataRace::addToCounter).start();
        }
    }
}
