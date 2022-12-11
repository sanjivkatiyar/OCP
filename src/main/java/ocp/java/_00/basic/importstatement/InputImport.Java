package ocp.java._00.basic.importstatement;
import java.nio.file.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.*;
// import java.nio.*.*;          // Compilation failure * cannot be used to match package
// import java.nio.file.xyz.abc.*; // Compilation failure package does not exist
import java.nio.file.Paths.*;  // Does not throw compilation error but does not import methods

class InputImport{

	public static void main(String arg[])
	{
		Paths.get("name");
		
	}
}