package ExpressionsStatementsAndMore;

// 2023. 09. 20. #3-7

public class mainChallenge {

	public static void main(String[] args) {
		
		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;
		
		int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
		System.out.println("The highScore is " + highScore);
		
		score = 10000;
		levelCompleted = 8;
		bonus = 200;
		int secondScore = calculateScore(gameOver, score, levelCompleted, bonus);
		System.out.println("The secondScore is " + secondScore);
		
		System.out.println("The next score is " + calculateScore(true, 10000, 8, 200));

	}
	
	// Making New Method
	
		public static int calculateScore (boolean gameOver, int score, int levelCompleted, int bonus) { // method
			
			int finalScore = score;
			if(gameOver) {
				finalScore += (levelCompleted * bonus);
				finalScore += 1000;
				// System.out.println("Your final score was "+ finalScore);
			}
			
			return finalScore;
		}
		
	/* Method structure with parameters and return type
	 * 
	 * 	// Method return type is a declared data type for the data that will be returned from the method
	 * 
	 * 	public static dataType methodName(p1type p1, p2type p2, {more}) {
	 * 
	 * 		// Method statements
	 * 
	 * 		return value;
	 * 	}
	 * 
	 * So, similar to declaring a variable with a type, we can declare a method to have a type.
	 * This declared type is placed just before the method name.
	 * In addition, a return statement is required in the code blok, which returns the result from the method.
	 * 
	 * Example
	 * 	In this case, the return type is an int.
	 * 
	 * 		public static int calculateMyAge (int yearOfBirth) {
	 * 			return (2023 - yearOfBirth);
	 * 		}*/
		
	/* The return statement
	 * 
	 * What's a return statement?
	 * Java states that a return statement returns control to the invoker of a method.
	 * The most common usage of return statement, is to return a value back from a method.
	 * In a method that doesn't return anything, in other words a method declared with void as the return type, a return statement is not required.
	 * But in methods that do return data, a return statement with a value is required.*/

}
