package ocp.java.mock.test2;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Q33 {
}

class PathTest {
    static Path p1 = Paths.get("c:\\finance\\data\\reports\\daily\\pnl.txt");

    public static void main(String[] args) {
        System.out.println(p1.subpath(0, 2));      // finance\data
    }
}

/*
Remember the following points about Path.subpath(int beginIndex, int endIndex) 1. Indexing starts from 0. 2. Root (i
.e. c:\) is not considered as the beginning. 3. name at beginIndex is included but name at endIndex is not. 4. paths
do not start or end with \.  Thus, in case of "c:\\finance\\data\\reports\\daily\\pnl.txt", name at 0 is finance and
name at 2 is reports. However, since the name at endIndex is excluded, subpath(0, 2) will correspond to finance\data.
   The following is the API description for this method:  public Path subpath(int beginIndex, int endIndex) Returns a
    relative Path that is a subsequence of the name elements of this path. The beginIndex and endIndex parameters
    specify the subsequence of name elements. The name that is closest to the root in the directory hierarchy has
    index 0. The name that is farthest from the root has index count-1. The returned Path object has the name
    elements that begin at beginIndex and extend to the element at index endIndex-1.  Parameters: beginIndex - the
    index of the first element, inclusive endIndex - the index of the last element, exclusive Returns: a new Path
    object that is a subsequence of the name elements in this Path Throws: IllegalArgumentException - if beginIndex
    is negative, or greater than or equal to the number of elements. If endIndex is less than or equal to beginIndex,
     or larger than the number of elements.
 */
