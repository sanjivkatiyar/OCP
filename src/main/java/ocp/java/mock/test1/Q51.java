package ocp.java.mock.test1;

class Data {
    private int x = 0;
    private String y = "Y";
    public Data(int k){
        this.x = k;
    }
    public Data(String k){
        this.y = k;
    }
    public void showMe(){
        System.out.println(x+y);
    }
}
public class Q51 {
    public static void main(String[] args) throws Exception {
        new Data(10).showMe();
        new Data("Z").showMe();
    }
}

/*
10Y 0Z
 */

// Note that + operator is overloaded for String.
// So if you have a String as any operand for +, a new combined String will be created by concatenating
// the values of both the operands. Therefore, x+y will result in a String that concatenates integer x and String y.