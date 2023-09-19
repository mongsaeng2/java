package IDEBasics;

// 2023.09.19. #2-7

public class ternaryOperator {

	public static void main(String[] args) {
		
		/* The Ternary Operator (Condition ?:Operator)
		 * 
		 * The ternary operator - Java officially calls it the Conditional Operator
		 * 	- has three operands, the only operator currently in Java that does have three.
		 * 
		 * The structure of this operator is:
		 * 	operand1 ? operand2 : operand3
		 * 	# what this operator does is test if operand1 is true, and if it is, it'll return operand 2,
		 * 		otherwise, it returns operand3.
		 * 	  The first condition is always a boolean test, but the other operands don't have to be boolean values.*/
		
		boolean isCar = false;
		if(!isCar) {
			System.out.println("This is not supposed to happen");
		}
		
		String makeOfCar = "Volkswagen";
		boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;
		
		if(isDomestic) {
			System.out.println("This car is domestic to our country");
		}
		
		/* Ternary Operator ?:
		 * 
		 * The ternary operator is a shortcut to assigning one of two values to a variable, depending on a given condition.
		 * */
		
		int ageOfClient = 20;
		String ageText = ageOfClient >= 18 ? "Over Eighteen" : "Still a kid";
			// Operand one -ageOfClient >= 18 in this case is the condition we're checking
				// It needs to return true, or false
			// Operand two -"Over Eighteen" here is the value to assign to the variable ageText, if the condition above is true.
			// Operand three -"Still a kid" here is the value to assign to the variable ageText, if the condition above is false.
		System.out.println("Our client is " + ageText);
			/* In this particular case, ageText is assigned the value "Over Eighteen",
				because ageOfClient has the value 20, which is greater than or equal to 18. */
		ageText = (ageOfClient >= 18) ? "Over Eighteen" : "Still a kid";
		isDomestic = (makeOfCar != "Volkswagen");
		
		String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
		
		System.out.println(s);

	}

}
