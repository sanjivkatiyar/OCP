package com.ocp.java.mock.test1;

import java.util.HashMap;
import java.util.Map;

public class Q42 {

    public static void main(String[] args) {

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("a", 1);
        map1.put("b", 1);
        map1.merge("b", 1, (i1, i2) -> i1 + i2);
        map1.merge("c", 3, (i1, i2) -> i1 + i2);
        System.out.println(map1);                            // {a=1, b=2, c=3}
    }
}

/*

The JavaDoc API description explains exactly how the merge method works.
You should go through it as it is important for the exam.

public V merge(K key, V value, BiFunction<? super V,? super V,? extends V> remappingFunction)

If the specified key is not already associated with a value or is associated with null,
associates it with the given non-null value.

Otherwise, replaces the associated value with the results of the given remapping function,
or removes if the result is null. This method may be of use when combining multiple mapped values for a key.
For example, to either create or append a String msg to a value mapping:
map.merge(key, msg, String::concat)
If the function returns null the mapping is removed.
If the function itself throws an (unchecked) exception, the exception is rethrown,
and the current mapping is left unchanged.
Parameters: key - key with which the resulting value is to be associated value
- the non-null value to be merged with the existing value associated with the key or,
if no existing value or a null value is associated with the key,
to be associated with the key remappingFunction
- the function to recompute a value if present  Returns:
the new value associated with the specified key,
or null if no value is associated with the key  Throws: UnsupportedOperationException
- if the put operation is not supported by this map (optional) ClassCastException
- if the class of the specified key or value prevents it from being stored in this map
(optional) NullPointerException
- if the specified key is null and this map does not support null keys or the value
or remappingFunction is null
 */