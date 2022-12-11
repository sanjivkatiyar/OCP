package ocp.java.mock.test2;

public class Q13 {

    public static void main(String[] args) {

        {
            // var a = b = c = 100;
            //There are two issues here -
            // 1. You cannot declare multiple variables in the same statement using var.
            // 2. Chaining to use a value of a variable at the time of declaration is not allowed.
            // Had b and c been already declared, it would have been valid. For example,
            // the following is valid:

            var b = 0;
            var c = 0;
            var a = b = c = 100;
        }
        {
            /*var a = 100, b = 10;
            var a = b;*/
            // 'var' is not allowed in a compound declaration. Therefore, var a = 100, b = 10; will not compile.
            var a = 100;
            var b = 10;
            a = b;
        }
        {
            int a,b,c=100;
        }
        {
            int a=100,b,c;
        }
        {
            // int a = 100 = b = c;
        }
        {
            int a, b, c;
            a = b = c = 100;
        }
        {
            //int a = b = c = 100;
            //Chaining to use a value of a variable at the time of declaration is not allowed.
            // Had b and c been already declared, it would have been valid.
            // For example, the following is valid:
            {
                int b = 0, c = 0;
                int a = b = c = 100;
            }
            //Even the following is valid:
            {
                int b , c;  //Not initializing b and c here.
                int a = b = c = 100; //declaring a and initializing c, b, and a at the same time.
                // Notice the order of initialization of
                // the variables - c is initialized first, b is initialized next by assigning to it the value of c.
                // Finally, a is initialized.
            }
        }

    }
}
