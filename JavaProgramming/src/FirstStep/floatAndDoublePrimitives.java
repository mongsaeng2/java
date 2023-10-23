package FirstStep;

// 2023.09.13. #8

public class floatAndDoublePrimitives {

	public static void main(String[] args) {
		
		/*Floating-point Numbers
		 * also know as real numbers
		 * We use a floating-point number when we need more precision in calculations.
		 * Scientific notation can be translated into more familiar terms,
		 * by replacing the 'E' in the number, with the phrase 'times 10 to the power of'.*/
		
		System.out.println("Float Value Range(" + Float.MIN_VALUE + " to " + Float.MAX_VALUE + ")");
		System.out.println("Double Value Range(" + Double.MIN_VALUE + " to " + Double.MAX_VALUE + ")");
		
		
		/*Important : The double data type is Java's default type for real numbers.
		 * 	The float data type can be specified as a numeric literal with a suffix of lowercase 'f', or uppercase 'F'.
		 * 	This suffix is required if you are assigning a real number to a variable that was declared with a float type.*/
		
		int myIntValue = 5;
		float myFloatValue = 5;
		double myDoubleValue = 5;
		
		myFloatValue = 5f;
		System.out.println("myFloatValue : "+myFloatValue);
		myDoubleValue = 5d;
		System.out.println("myDoubleValue : "+myDoubleValue);
		
		// float myOtherFloatValue = 5.25; ▶ 5.25가 double로 자동인식 되기 떄문에 ERROR 발생
			// float != double ▼ this is the solution
		float myOtherFloatValue = 5.25f;
			  myOtherFloatValue = (float)8.10;
		System.out.println(myOtherFloatValue);
		
		myIntValue = 5 / 2;
		System.out.println("myIntValue : " + myIntValue);
			// ▶ the result is an integer value, and that value is 2.
			//	 The decimal part is not included.
		
		myFloatValue = 5f/ 2f;
		System.out.println(myFloatValue);
		
		myDoubleValue = 5d / 2d;
		System.out.println(myDoubleValue);
		
		
		myIntValue = 5 / 3;
		System.out.println(myIntValue);
		myFloatValue = 5f/3f;
		System.out.println(myFloatValue);
		myDoubleValue = 5d/3d;
		System.out.println(myDoubleValue);
		myDoubleValue = 5.0/3.0;
		System.out.println(myDoubleValue);
		myDoubleValue = 5.0/3;
		System.out.println(myDoubleValue);
		myFloatValue = (float)5.00 / 3f;
		System.out.println(myFloatValue);
		
		/*Why is the double a better choice in most circumstances? = Why should we choose double?
		 *	First, it's actually faster to process on many modern computers.
		 *	 That's because computers have, at the chip level,
		 *	 the functionality to actually deal with these double numbers faster than the equivalent float.
		 *	Second, the Java libraries particularly math functions, are often written to process doubles and not floats,
		 *	 and to return the result as a double.
		 *	The creators of Java selected the double because it'smore precise, and it can handle a larger range of numbers. */
		
		/*CHALLENGE
		 * The objective of this challenge, is to convert a given number of pounds to kilograms.
		 * STEPS:
		 * 	1. Create a variable with the appropriate type, to store the number of pounds that we want to convert into kilograms.
		 * 	2. Calculate kilograms, using the variable above, and store the result in a 2nd appropriately typed variable.
		 * 	3. print the result.
		 * 	# 1 pound is equal to 0.45359237 of a kilogram.*/
		
		//MyAnswer
		double targetWeight = 200;
		double pound = 0.45359237;
		double kgResult = targetWeight * pound;
		System.out.println(kgResult);
		
		//Lecture Answer
		double numberOfPounds = 200d;
		double convertedKilograms = numberOfPounds * 0.45359237d;
		System.out.println(convertedKilograms);
		
		double pi = 3.1415387d;
		double anotherNumber = 3_000_000.4_567_890d;
		System.out.println(anotherNumber);
		
		/*In general, float and double are great for general floating point operations.
		 * 	But neither should be used when precise calculations are required
		 * 	 - this is due to a limitation with how floating point numbers are stored, and not a Java problem as such.
		 *	Java has a class called BigDecimal that overcomes this.
		 *		For now, just keep in the back of my mind that when precise calculations are necessary,
		 *		 I will probably need to use the BigDecimal class, and not a float or double.*/
		
		
	}

}
