package ExpressionsStatementsAndMore;

//2023. 09. 21. # 3-9

public class methodChallenge {
	
	// call the method
	public static void main(String[] args) {
		
		int highScorePosition = calculateHighScorePosition(1500);
		displayHighScorePosition("Minji", highScorePosition);
		
		highScorePosition = calculateHighScorePosition(499);
		displayHighScorePosition("Heegeun", highScorePosition);
		
		highScorePosition = calculateHighScorePosition(99);
		displayHighScorePosition("Yangsook", highScorePosition);
		
		highScorePosition = calculateHighScorePosition(9);
		displayHighScorePosition("Monnani", highScorePosition);
	}

/* Method Challenge
 * 
 * The first method should be named displayHighScorePosition
 * 		This method should have two parameters, one for a player's name, and one for a player's position in a high score list.
 * 		This method should print a message like "Tim managed to get into position 2 on the high score list."
 * 
 * The second method should be named calculateHighScorePosition
 * 		This method should have only one parameter, the player's score.
 * 		This method should return a number between 1 and 4 based on the score values shown in this table.
 * 		- Score / Result
 * 		- Score greater than or equal to 1000 / 1
 * 		- Score greater than or equal to 500 but less than 1000 / 2
 * 		- Score greater than or equal to 100 but less than 500 / 3
 * 		- All other scores / 4
 */

	// My Answer
	
	public static void displayHighScorePosition(String playerName, int highScorePosition) {
		
		System.out.println(playerName + " managed to get into " + highScorePosition + " on the high score list.");
	}
	
	public static int calculateHighScorePosition(int playerScore) {
		
		/* my answer*/
		int result = 0;
		
		if(playerScore >= 1000) {
			result = 1;
		} else if(playerScore >= 500) {
			result = 2;
		} else if(playerScore >= 100) {
			result = 3;
		} else {
			result = 4;
		}
		
		return result;
		
		/*
		// lecture answer
		
		if (playerScore >= 1000) {
			return 1;
		} else if (playerScore >= 500 && playerScore < 1000) {
			return 2;
		} else if (playerScore >= 100 && playerScore < 500) {
			return 3;
		} else {
			return 4;
		}
		
		// OR
		if(playerScore >= 1000) {
			return 1;
		} else if(playerScore >= 500) {
			return  2;
		} else if(playerScore >= 100) {
			return  3;
		}
		
		 return 4;
		
		
		// OR
		 int position = 4;
		 if(playerScore >= 1000) {
			position = 1;
		} else if(playerScore >= 500) {
			position = 2;
		} else if(playerScore >= 100) {
			position = 3;
		}
		
		 return position;
			
 
		 */
	}
	

}
