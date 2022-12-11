package ocp._01.datatypes.LocalVariableTypeInference;

public class Test {

    // var number4="abc";            // Not allowed with class or instance variable

    public static void main(String[] args) {
        var number=11;               // compiler will infer the data type as int

        //var number1;               // Must be initialized on declaration to infer the data type

        var number2=11;
        //number2="Java";            // Changing data type is not allowed. initially, the type inferred for the variable number was int
        //var number3=null;          // Null is not allowed because it cannot determine the type of the variable from the value null
    }
}
