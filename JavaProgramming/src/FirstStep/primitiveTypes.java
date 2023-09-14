package FirstStep;

// 2023.09.13. #4

public class primitiveTypes {

	public static void main(String[] args) {
		
		//Java's Primitive Types

		int myValue = 10000;
		
		
		// range of int
		int myMinIntValue = Integer.MIN_VALUE;
		System.out.println(myMinIntValue);
		
		int myMaxIntValue = Integer.MAX_VALUE;
		System.out.println(myMaxIntValue);
		
		System.out.println("Integer Minimum Value = "+ myMinIntValue);
		System.out.println("Integer Maximum Value = "+ myMaxIntValue);
		
		System.out.println();
		
		System.out.println("Integer Value Range (" + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE + ")");
		
		System.out.println();
		
		
		
		/*Classes
		 * A class is a building block for object-oriented programming, and allows us to build custom data types.
		 * 
		 * Wrapper Classes
		 * Java uses the concept of a wrapper class, for all of its eight primitive data types.
		 * A wrapper class provides simple operations, as well as some basic information about the primitive data type,
		 *   which cannot be stored on the primitive itself.*/
		
		//OverFlow, UnderFlow
		System.out.println("Busted Max value = " + (myMaxIntValue +1));
		System.out.println("Busted Min value = " + (myMinIntValue -1));
		
		System.out.println("Integer Maximum Value = " + Integer.MAX_VALUE);
		// int myMaxIntTest = 2147483648; => Error : the number is too big to put in int
		
		// int myMaxIntTest = 2147483647;
		
		// In Java, you cannot put commas in a numeric literal.
		int myMaxIntTest = 2_147_483_647;
		
		System.out.println(myMaxIntTest);
		
	}

}
