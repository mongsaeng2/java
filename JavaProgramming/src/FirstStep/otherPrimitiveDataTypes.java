package FirstStep;

// 2023.09.13. #5

public class otherPrimitiveDataTypes {

	public static void main(String[] args) {
		
		System.out.println("Integer Value Range(" + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE +")");

		//Byte
		System.out.println("Byte value Range(" + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE + ")");
		
		//Short
		System.out.println("Short value Range(" + Short.MIN_VALUE + " to " + Short.MAX_VALUE + ")");
		
		// Both the byte and the short, have the same overflow and underflow issue as the int data type has.
		
		
		//Long
		long myLongValue = 100L;
		
		System.out.println(myLongValue);
		System.out.println("A long has a width of " + Long.SIZE);
		System.out.println("Long value Range(" + Long.MIN_VALUE + " to " + Long.MAX_VALUE + ")");
			// Long is much bigger than int type
		
		long bigLongLiteralValue = 2_147_483_647_243L;
		System.out.println(bigLongLiteralValue);
			// A numeric literal that exceeds Integer.MAX_VALUE must use the 'L' suffix.
			// We cannot create a numeric literal in Java, that exceeds Integer.MAX_VALUE, without using the 'L' suffix,
			// we'll always get the error 'integer number too large'.
		
		short bigShortLiteralValue = 32767;
		System.out.println(bigShortLiteralValue);
		
	}

}
