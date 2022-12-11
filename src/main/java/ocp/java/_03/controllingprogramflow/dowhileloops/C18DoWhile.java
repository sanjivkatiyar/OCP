package ocp.java._03.controllingprogramflow.dowhileloops;

public class C18DoWhile {
    public static void main(String[] args) {
        int x = 3;
        do
            System.out.println(x);  // 3
        while (x>99);

        do {
            System.out.println(x);
            --x;
        }while(x>0); //3,2,1

        /*do {

        }while (x>0)*/  // ; missing
    }
}
