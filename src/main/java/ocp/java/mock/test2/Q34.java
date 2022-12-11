package ocp.java.mock.test2;

public class Q34 {
}

class TestClass1 {
    public void switchString(String input) {
        switch (input) {
            case "a":
                System.out.println("apple");
            case "b":
                System.out.println("bat");
                break;
            case "B":
                System.out.println("big bat");
            default:
                System.out.println("none");
        }
    }

    public static void main(String[] args) throws Exception {
        var tc = new TestClass1();
        tc.switchString("B");
    }
}

/*
big bat
none
 */
