package ocp.java.mock.test1;

public class Q3 {
    public static void main(String args[]) {
        int i, j, k;
        i = j = k = 9;
        //int i = j = k = 9;        // compiler error
        System.out.println(i);
    }
}
/*
= can be chained. For example, assuming all the variables are declared appropriately before hand,
a = b = c = d; is valid.
However, chaining to use a value of a variable at the time of declaration is not allowed.
For example, int a = b = c = 100; is invalid if b and c are not already declared.
Had b and c been already declared,
int a = b = c = 100; would have been valid.


Every expression has a value, in this case the value of the expression is the value
that is assigned to the right-hand side of the equation. k has a value of 9 which is assignd to j and then to i.
However, you cannot use a variable before it is initialized.
So, the following statements will not compile because in these cases,
the value of local x is being accessed before it has been initialized.:

int x=x* 4;  // compilation failure or
int x= x;    // compilation failure

An implication of "an expression has a value" concept is as follows:

boolean b = false;
if( b = true)
{ System.out.println("TRUE");}
The above code is valid and will print TRUE. Because b = true has a boolean value,
which is what an if statement expects.
Note that if( i = 5) { ... } is not valid
because the value of the expression i = 5 is an int (5) and not a boolean.
 */