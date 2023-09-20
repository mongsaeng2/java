package ExpressionsStatementsAndMore;

// 2023. 09. 20. # 3-4, 5

public class codeBlock {

	public static void main(String[] args) {
		
		/* Code Blocks And The If Then Else Control Statement */

		boolean gameOver = true;
		int score = 5000;
		int levelCompleted = 5;
		int bonus = 100;
		
		if(score == 5000) {
			System.out.println("Your score was 5000");
		}
		
		/* If with an Else block
		 * 
		 * if(condition){
		 * 	// Code in block will execute only if
		 *	// condition is true
		 * } else {
		 * 	// Code in block will execute only if
		 * 	// condition is false
		 * }*/
		
		if(score <= 5000) {
			System.out.println("Your score was less than or equal to 5000");
		} else {
			System.out.println("Got here");
		}
		
		/* If with an Else if and Else block
		 * 
		 * if (firstCondition) {
		 * 		// Code in block will execute only if
		 * 		// firstCondition is true
		 * 
		 * } else if (secondCondition) {
		 * 		// Code in block will execute if firstCOndition is false
		 * 		// and secondCondition is true
		 * 	THERE IS NO LIMIT TO THE NUMBER OF CONDITIONS THAT CAN BE TESTED
		 * 
		 * } else {
		 * 
		 * 		// Code in block will execute if
		 * 		// all conditions above are false
		 * 	THE ELSE BLOCK MUST BE LAST BUT IS OPTIONAL
		 * } */

		if(score < 5000 && score > 1000) {
			System.out.println("Your score was less than 5000 but greater than 1000");
		} else if (score < 1000) {
			System.out.println("Your score was less than 1000");
		} else {
			System.out.println("Got here");
		}
		
		score = 800;
		
		int finalScore = score;
		if(gameOver) { // = if(gameOver ==true)
			finalScore += (levelCompleted * bonus);
			System.out.println("Your final score was " + finalScore);
		}
		
		/* If then else Challenge
		 * 
		 * Set the existing score variable to 10,000.
		 * Set the existing levelCompleted variable to 8.
		 * Set the existing bonus variable to 200.
		 * Use the same if condition you want to perform the same calculation, and print out the value of the finalScore variable.*/
		
		// my answer
		
		score = 10000;
		levelCompleted = 8;
		bonus = 200;
		finalScore = score;
		
		if(gameOver) {
			finalScore += (levelCompleted * bonus);
			System.out.println("My final score is " + finalScore);
		}
		
	}

}
