package FirstStep;

//2023.09.14. #12

public class operatorsOperandsAndExpressions {

	public static void main(String[] args) {
		
		/* Operators
		 *	Operators in Java are special symbols that perform specific operations on one, two, or three operands, and then return a result.
		 *  
		 * Operands
		 * 	An operand is a term used to describe any object that is manipulated by an operator.
		 * 	 So if we consider this:
		 * 		int myVar = 15+12;
		 * 		The plus here is the operator, and 15 and 12 are the operands.
		 * 		 Variables used instead of literals can also be operands.
		 * 
		 * Expression
		 * An expression is formed by combining variables, literals, method return values, and operators.
		 * In the statement below, byteValue + shortValue + intValue is the expression.
		 * 		int sumOfThree = byteValue + shortValue + intValue;*/
		
		int result = 1+2;
		System.out.println(result);
		
		/*Comment
		 * Comments are ignored by the computer, and are added to a program, to help describe something.
		 * Comments are there for humans to read.
		 * */
		
		int previousResult = result;
		System.out.println(previousResult);
		result = result -1;
		System.out.println("previousResult = "+previousResult);
			// Even though we previously assigned result, to the prevousResult variable,
			//	it did not get updated when result got a new value of two.
			// The value in previousResult remained unchanged.
		
		char firstChar = 'A'; char secondChar = 'B';
		System.out.println(firstChar + secondChar); // 131 = 65+66 by Unicode Decimal
		System.out.println("" + firstChar + secondChar); //AB
		
		result = 2;
		result = result * 10;
		System.out.println(result);
		
		result = result/4;
		
		/* The Remainder Operator
		 * 
		 * The remainder operator is represented in Java by the % sign.
		 * The remainder operator returns the remaining value from a division operation.*/
		
		result = 5;
		result = result % 3;
		System.out.println(result); // the remainder of (5%3) = 2
		
		
		
	}

}
