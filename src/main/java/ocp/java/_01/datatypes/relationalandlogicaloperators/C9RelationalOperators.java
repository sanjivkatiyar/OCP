package ocp.java._01.datatypes.relationalandlogicaloperators;

public class C9RelationalOperators {
    public static void main(String[] args) {
        System.out.println(5.0 == 5); // true i.e. 5.0 == 5.0 (promotion)
        System.out.println(5.1 == 5); // false i.e. 5.1 == 5.0 (promotion)
        System.out.println(5.0 == 5L); // true i.e. 5.0 == 5.0 (promotion)

        int x=8, y=9;
        System.out.println(x == y); // false
        System.out.println(x != y); // true
    }
}
