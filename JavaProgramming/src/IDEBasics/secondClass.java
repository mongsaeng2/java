package IDEBasics;

//2023.09.15. #2-2,3,4,5,6

public class secondClass {

	public static void main(String[] args) {
		System.out.println("Hello, Minji");
		System.out.println("Hello World");
		
		/* if-then statements in Java
		 * 
		 * The if-then statement is the most basic of all the control flow statements.
		 * 	It tells your program to execute a certain section of code, only if a particular tests evaluates to true.
		 * 
		 * Conditional Logic
		 * Conditional logic uses specific statements in Java to allow us to check a condition,
		 *  and execute certain code based on whether that condition (the expression) is true or false.
		 * */
		
		boolean isAlien = false;
		if(isAlien == false) {
			System.out.println("It is not an alien!");
			System.out.println("And I am scared of aliens");
		}
			
		/* The Code Block
		 * A code block allows more than one statement to be executed, in other words, a block of code.
		 * 
		 * The format is:
		 * 		if (expression){
		 * 			// put one or more statements here
		 * 		}
		 * */
		
		int topScore = 80;
		if(topScore <= 100) {
			System.out.println("You got the high score!");
		}
		
		int secondTopScore = 95;
		if((topScore > secondTopScore) && (topScore < 100)) {
			System.out.println("Greater than second top score and less than 100");
		}
		
		/* The Logical AND operator and the Logical OR Operator
		 * 
		 * The and operator comes in two flavours in Java, as does the or operator.
		 * && is the Logical and which operates on boolean operands - Checking if a given condition is true or false.
		 * The & is a bitwise operator working at the bit level.
		 * 
		 * Likewise || is the Logical or, and again it operates on boolean operands - Checking if a given condition is true or false.
		 * The | is a bitwise operator, which is also working at the bit level.
		 * And just like the bitwise and operator, we won't be using it as much as their logical counterparts.
		 * 
		 * We'll almost always be using the logical operators.
		 * */
		
		if((topScore > 90) || (secondTopScore <=90)) {
			System.out.println("Either or both of the conditions are true");
		}
		
		/* Assignment Operator VS Equals to Operator
		 * */
		
		// 1. if(newValue = 50) != if(newValue == 50)
		int newValue = 50;
		if(newValue == 50) { 
			// We're not assigning a value here, instead, we want to test if the values are equal to each other.
			// We need to put the second equal sign in:
				// which is now an "equal to" operator, and we're correctly comparing the value of newValue, to the value 50.
			System.out.println("This is true");
		}
		
		// 2. if(isCar = true) != if(isCar == true)
		boolean isCar = false;
		if(!isCar) {
			// if statement requires a boolean
			System.out.println("This is not supposed to happen");
		}
		
		/* The NOT Operator
		 * The exclamation mark(!), or NOT operator, is also known as the Logical Complement Operator.
		 * 
		 * generally recommend using the abbreviated form, if your variables are booleans, for two reasons.
		 * 1. It's much harder to identify the error, if you accidentally use an assignment operator.
		 * 2. the code is more concise, and more concise code can often be more readable code.
		 * */
		
	}

}
