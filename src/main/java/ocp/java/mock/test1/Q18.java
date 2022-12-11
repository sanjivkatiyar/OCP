package ocp.java.mock.test1;

public class Q18 {

    public static Integer wiggler(Integer x){
        Integer y = x + 10;
        x++;
        System.out.println(x);                       // 6
        return y;
    }

    public static void main(String[] args){
        Integer dataWrapper = new Integer(5);
        Integer value = wiggler(dataWrapper);
        System.out.println(dataWrapper+value);        // 5 + 15
    }
}
