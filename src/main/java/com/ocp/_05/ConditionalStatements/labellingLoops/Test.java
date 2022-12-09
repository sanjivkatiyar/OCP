package com.ocp._05.ConditionalStatements.labellingLoops;

public class Test {
    public static void main(String args[])
    {
        int i,j;
        loop1:   for(i=1;i<=10;i++)
        {
            System.out.println();
            loop2:   for(j=1;j<=10;j++)            // un-used label
            {
                System.out.print(j + " ");
                if(j==5)
                    break loop1;     //Statement 1  // We can also break to loop2 (work like normal break)
            }
        }
    }
}

/*
Now when we use a break statement inside the inner loop we can exit the inner loop,
but what if we need to jump out from the outer loop using the break statement given inside the inner loop?
The answer is, we should define the label along with the colon(:) sign before the loop.
 */