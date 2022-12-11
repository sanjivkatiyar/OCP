package ocp._22.StringBuilder;

public class Test {

    public static void main(String[] args) {

        System.out.println(formatPhone("6027759483"));

    }

    public static String formatPhone(String input){
        if(input != null && input.trim().length() == 10){
            StringBuilder formatted = new StringBuilder(input);
            formatted = formatted.insert( 0, "+1(" );
            formatted = formatted.insert( 6 , ")" );
            formatted = formatted.insert( 10 , "-" );
            return formatted.toString();
        }
        return null;
    }
}
