package ocp.java.mock.test2;

public class Q20 {
}

/*

There are three command line options applicable to javac and java that can be used for customizing exports
and requires configurations of modules temporarily (temporarily means only for that particular command execution).
These are: add-reads, add-exports, and, add-opens. For example, if you want moduleA to be able to read public
 packages of moduleB and neither of the modules have appropriate information in their respective module-info files,
 then you can use the following commands to enable such access :  javac --add-reads moduleA=moduleB --add-exports
 moduleB/com.modB.package1=moduleA ... java --add-reads moduleA=moduleB --add-exports
 moduleB/com.modB.package1=moduleA ...  --add-reads moduleA=moduleB implies that moduleA wants to read
 all exported packages of moduleB. --add-exports moduleB/com.modB.package1=moduleA implies that moduleB
 exports package com.modB.package1 to moduleA.  --add-open is used to provide access to private members of
 classes through reflection but is not required for 1Z0-815 exam.

 */