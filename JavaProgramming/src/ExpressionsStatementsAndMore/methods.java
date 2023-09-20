package ExpressionsStatementsAndMore;

// 2023. 09. 20. #3-6

public class methods {

	public static void main(String[] args) {
		
		/* The Method
		 * 
		 * Java's description of the method is:
		 * A method declares executable code that can be invoked, passing a fixed number of values as arguments.
		 * 
		 * The Benefits of the Method
		 * A method is a way of reducing code duplication.
		 * A method can be executed many times with potentially different results,
		 *  by passing data to the method in the form of arguments.
		 *  
		 *  Structure of the Method
		 *  
		 *  One of the simplest ways to declare a method is shown on this slide.
		 *  This method has a name, but takes no data in, and returns no data from the method
		 *   (which is what the special word void means in this declaration).
		 *   
		 *   public static void methodName() {
		 *   
		 *   	// Method statements form the method body
		 *   
		 *   }
		 *   
		 * Executing a Method as a Statement
		 * To execute a method, we can write a statement in code, which we say is calling, or invoking, the method.
		 * For simple method like calculateScore, we jsut use the name of the method, where we want it to be executed, followed by parentheses,
		 *  and a semi-colon to complete the statement.
		 *   */
	
		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;
		
		int finalScore = score;
		
		calculateScore();
		
		score = 10000;
		levelCompleted = 8;
		bonus = 200;
		
		finalScore = score;
	
	} // This is the end of main method
	
	// Making New Method
	
	public static void calculateScore() { // method
		
		boolean gameOver = true;
		int score = 800;
		
	}
	
	

}
