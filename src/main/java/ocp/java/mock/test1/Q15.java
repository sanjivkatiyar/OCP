package ocp.java.mock.test1;

public class Q15 {

    int value = 1;
    Q15 link;
    public Q15(int val){ this.value = val; }
    public static void main(String[] args){
        final var a = new Q15(5);
        var b = new Q15(10);
        a.link = b;
        b.link = setIt(a, b);                                 // this is setting a.link to null
        System.out.println(a.link.value+" "+b.link.value);    // a.link.value will be null
    }

    public static Q15 setIt(final Q15 x, final Q15 y){
        x.link = y.link;
        return x;
    }

}
