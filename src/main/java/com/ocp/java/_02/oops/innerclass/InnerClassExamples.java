
package com.ocp.java._02.oops.innerclass;
class OuterClass {
	private int outerClassInstanceVariable;
	public int publicOuterClassInstanceVariable;

	public void exampleMethod() {
		int localVariable;
		final int finalVariable = 5;

		// static class MethodLocalStaticInnerClass{}     // method local inner class can not be static
		// interface I {}           // method local interface are supported in java 16

		class MethodLocalInnerClass {
			public void method() {
				// Can access class instance variables
				System.out.println(outerClassInstanceVariable);

				// Cannot access method's non-final local variables
				// localVariable = 5;//Compiler Error
				System.out.println(finalVariable);// Final variable is fine..
			}
		}

		// MethodLocalInnerClass can be instantiated only in this method
		MethodLocalInnerClass m1 = new MethodLocalInnerClass();
		m1.method();
	}

	// MethodLocalInnerClass can be instantiated only in the method where it is
	// declared
	// MethodLocalInnerClass m1 = new MethodLocalInnerClass();//COMPILER ERROR

	public static class StaticNestedClass {
		private int staticNestedClassVariable;

		public int getStaticNestedClassVariable() {
			return staticNestedClassVariable;
		}

		public void setStaticNestedClassVariable(int staticNestedClassVariable) {
			this.staticNestedClassVariable = staticNestedClassVariable;
		}

		public void nonStaticVariablesOfOuterClassAreNOTAvailable() {
			// outerClassInstanceVariable = 5; //COMPILE ERROR
			// publicOuterClassInstanceVariable =4; // should be static
		}
	}

	public class InnerClass {
		private int innerClassVariable;

		public int getInnerClassVariable() {
			return innerClassVariable;
		}

		public void setInnerClassVariable(int innerClassVariable) {
			this.innerClassVariable = innerClassVariable;
		}

		public void privateVariablesOfOuterClassAreAvailable() {
			outerClassInstanceVariable = 5; // we can access the value and
											// change it

			System.out.println("Inner class ref is " + this);

			// Accessing outer class reference variable
			System.out.println("Outer class ref is " + OuterClass.this);
		}
	}

	public void createInnerClass() {
		// Just use the inner class name to create it
		InnerClass inner = new InnerClass();
	}

	private class PrivateInnerClass{
		// public static print(){ }           // Static methods are not allowed in non-static inner class
		// static int TT = 5;                 // not allowed
		final static int TT = 5;              // allowed if final

	}

	class DefaultInnerClass{

		class AnotherInnerClass{}
		// static class AnotherStaticInnerClass{}  // Supported in java 16
	}

	protected class ProtectedInnerClass{}

	private static class PrivateStaticInnerClass{

		class OneMoreClass{}
		static class OneMoreInnerClass{}           // static inner class not have another level of static inner class
	}

	protected static class ProtectedStaticInnerClass{}

	static class DefaultStaticInnerClass{}

	interface I {}

	static interface II {}



}

public class InnerClassExamples {
	public static void main(String[] args) {
		// Static Nested Class can be created without needing to create its
		// parent. Without creating NestedClassesExample, we created
		// StaticNestedClass
		OuterClass.StaticNestedClass staticNestedClass1 = new OuterClass.StaticNestedClass();
		staticNestedClass1.setStaticNestedClassVariable(5);

		OuterClass.StaticNestedClass staticNestedClass2 = new OuterClass.StaticNestedClass();
		staticNestedClass2.setStaticNestedClassVariable(10);

		// Static Nested Class member variables are not static. They can have
		// different values.
		System.out.println(staticNestedClass1.getStaticNestedClassVariable()); // 5
		System.out.println(staticNestedClass2.getStaticNestedClassVariable()); // 10

		// COMPILER ERROR! You cannot create an inner class on its own.
		// InnerClass innerClass = new InnerClass();
		OuterClass example = new OuterClass();

		// To create an Inner Class you need an instance of Outer Class
		OuterClass.InnerClass innerClass = example.new InnerClass();

	}
}