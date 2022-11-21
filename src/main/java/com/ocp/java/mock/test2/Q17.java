package com.ocp.java.mock.test2;

import java.util.ArrayList;
import java.util.HashSet;

public class Q17 {

    public static void main(String[] args) {

        var nameList = new ArrayList<String>();
        nameList.add("Ally");
        nameList.add("Billy");
        nameList.add("Cally");
        nameList.add("Billy");
        nameList.add("Ally");
        var nameSet1 = new HashSet<String>();
        for (var name : nameList) nameSet1.add(name);
        var nameSet2 = new HashSet<String>(nameList);
        System.out.println(nameList.size() + " " + nameSet1.size() + " " + nameSet2.size());
    }
}
// 5 3 3

// A Set represents a collection of unique elements. When you add an element to a Set,
// the element is compared with the elements of the Set and it is added to the set only
// if it does not already exist in the set.  Thus, nameSet1 will contain only three unique elements.

// The HashSet(Collection<? extends E> c) constructor constructs a new set
// containing the elements in the specified collection. If the collection contains duplicate elements
// they will not be added to the set.