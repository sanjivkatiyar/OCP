package ocp.java._03.controllingprogramflow.breakandcontinue;
// A continue causes the next iteration of the loop to start without executing
// the remaining statements in the loop. The updation section (if it is a for loop)
// and the condition is also checked before the next iteration of the loop is started.
public class C21BreakAndContinue {
    public static void main(String[] args) {
       // nestedLoop();
       normalBreak();
       // normalContinue();
        unreachableCode();
    }

    public static void nestedLoop(){
        for(int i = 1; i<=3; i++){
            for(int j =1; j<=5; j++){
                System.out.println(i+", "+j);
            }
        }
    }

    public static void normalBreak(){
        for(int i = 1; i<=3; i++){
            for(int j =1; j<=5; j++){
                if(j==3){
                    break;
                }
                System.out.println(i+", "+j);
            }
        }
    }

    public static void normalContinue(){
        for(int i = 1; i<=3; i++){
            for(int j =1; j<=5; j++){
                if(j==3){
                    continue;
                }
                System.out.println(i+", "+j);
            }
        }
    }

    public static void unreachableCode(){
        for(int i = 1; i<=3; i++){
            for(int j =1; j<=5; j++){
                //if(j==3) {
                    continue; // or break
               // }
               // System.out.println(i+", "+j); //unreachable code
            }
        }
    }
}
