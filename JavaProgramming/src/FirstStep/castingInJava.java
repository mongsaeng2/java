package FirstStep;

// 2023.09.13. #6

public class castingInJava {

	// when, and why, casting is sometimes necessary in Java Code.
	
	public static void main(String[] args) {
		
		short myMinShrotValue = Short.MIN_VALUE; int myMinIntValue = Integer.MIN_VALUE;
		
		System.out.println("myMinShortValue : "+myMinShrotValue);
		System.out.println("myMinIntValue : "+myMinIntValue);
		
		byte myMinByteValue = Byte.MIN_VALUE; byte myMaxByteValue = Byte.MAX_VALUE;
		System.out.println("myMinByteValue : "+myMinByteValue);
		System.out.println("myMaxByteValue : "+myMaxByteValue);
		
		short firstShort = 1; int firstInteger = 2;
		
		System.out.println(firstShort);
		System.out.println(firstInteger);
		
		byte firstByte = 1, secondByte = 2;
		System.out.println(firstByte);
		System.out.println(secondByte);
		
		int myTotal = (myMinIntValue / 2);
		System.out.println(myTotal);
		

		/*byte myNewByteValue = (myMinByteValue / 2);
		 * System.out.println(myNewByteValue); ERROR
		 * (myMinByteValue /2)
		 * => So, basically, what's in the parentheses, is treated as an int by the computer,
		 * 	and that's why we're getting this error
		 * => Java에게 byte의 범위안에 들어가는 숫자가 맞다는 것을 알려주기 위해 casting을 함
		 */
		
		byte myTestByteValue = (-128/2);
		System.out.println(myTestByteValue);
			/* The java compiler does not attempt to evaluate the value, in a variable,
			   when it's used in a calculation, so it doesn't know if the value fits, and throws an error.
			   
			   If your calculation uses literal values, Java can figure out the end result at complie time,
			    and whether it fits into the variable, and won't throw an error if it does.
			*/
		
		/* Casing in Java
		 * Casting means to treat or convert a number, from one type to another.
		 * 	We put the type we want the number to be, in parentheses like this : */
		
		byte myNewByteValue = (byte)(myMinByteValue / 2);
		System.out.println("After Casting : "+myNewByteValue);
		
	}

}
