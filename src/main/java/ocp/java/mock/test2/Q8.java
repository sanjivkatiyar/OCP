package ocp.java.mock.test2;

import java.util.List;
import java.util.Map;

public class Q8 {

    public static void main(String[] args) {

        List<String> keys = List.of("a");  //1          // unmodifiable list
        keys.add("b"); //2
        Map<String, String> map = Map.of(); //3         // empty unmodifiable map
        int i = 0; for(var key : keys){
            map.put(key, "----");
        } System.out.println(keys+" "+map.size());
    }
}

/*

The List.of, Set.of, and Map.of methods return an unmodifiable List,
Set, and Map respectively. You cannot add or remove elements from them once they are created.
 Thus, line //2 and //3 will cause java.lang.UnsupportedOperationException to be thrown
 */