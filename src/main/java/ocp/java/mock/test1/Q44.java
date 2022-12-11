package ocp.java.mock.test1;

public class Q44 {

    public static void main(String[] args) {

        // for (var i=5; i=0; i--) { }        // should be boolean condition check

//        var k=5;
//        for(int i=0, k+=5;  i<k ; i++) {  k--;  }

        // uses 'k +=5'. Now, this statement is preceded by 'int i=0,' and that means we are trying to declare variable k.
        // But it is already declared before the for loop.
        // If we remove the int in the initialization part and declare i before the loop then it will work.
        // But if we remove the statement int k = 5; it will not work because compiler will try to do k = k+5,
        // and you can't use the variable before it is initialized.
        // Although the compiler gives a message 'Invalid declaration' for k += 5, it really means the above-mentioned thing.



//        int l, m;
//        for (m=10; l<m; m--) { l += 2; }
        //  l is uninitialized.

        var n=10;
        for ( ; n>0 ; n--) { }
        //is valid. It contains empty initialization part.

        for (int i=0, j=10; i<j; i++, --j) {;}
        // This is perfectly valid. You can have any number of comma separated statements in initialization and incrementation part.
        // The condition part must contain a single expression that returns a boolean.
        //All a for loop needs is two semi colons :-
        //for( ; ; ) {} This is a valid for loop that never ends. A more concise form for the same is : for( ; ; );

        // for (var i=0, j=10; i<j; i++, --j) {;}
        // var is not allowed in compound declaration. So, var i=0, j=10; is invalid.
    }
}
