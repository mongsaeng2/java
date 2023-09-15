package IDEBasics;

//2023.09.15. #2-2,3,4

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
		
		int topScore = 100;
		if(topScore == 100) {
			System.out.println("You got the high score!");
		}
		
	}

}
