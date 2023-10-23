package ExpressionsStatementsAndMore;

// 2023. 10. 17. 3-11

public class methodOverloading {

	public static void main(String[] args) {
		
		/* Method Overloading
		 * 
		 * Method overloading occurs when a class has multiple methods,
		 * 	with the same name, but the methods are declared with different parameters.
		 * 
		 * So you can execute a method with one name, but call it with different arguments.
		 * 
		 * Java can resolve which method it needs to execute, based on the arguments being passed,
		 * 	when the method is invoked.
		 * 
		 * More on Method Signature
		 * 
		 * A method signature consists of the name of the method,
		 *  and the uniqueness of the declaration of its parameters.
		 *  
		 * In other words, a signature is unique, not just by the method name,
		 *  but in combination with the number of parameters, their types, and the order
		 *  in which they are declared.
		 * 
		 * A method's return type is not part of the signature.
		 * 
		 * A parameter name is also not part of the signature.
		 * 
		 * Valid Overloaded Methods
		 * 
		 * The type, order, and number of parameters, in conjunction with the name,
		 *  make a method signature unique.
		 * A unique method signature is the key for the Java compiler,
		 *  to determine if a method is overloaded correctly.
		 * The name of the parameter is not part of the signature,
		 *  and therefore it doesn't matter, from Java's point of view, what we call our parameters.
		 * 
		 * These examples demonstrate some valid overloaded method, for the doSomething method.
		 * 
		 * public static void doSomething(int parameterA){
		 * 	// method body
		 * }
		 * 
		 * public static void doSomething(float parameterA){
		 * 	// method body
		 * }
		 * 
		 * public static void doSomething(int parameterA, float parameterB){
		 * 	// method body
		 * }
		 * 
		 * public static void doSomething(float parameterA, int parameterB){
		 * 	// method body
		 * }
		 * 
		 * public static void doSomething(int parameterA, int parameterB, float parameterC){
		 * 	// method body
		 * }
		 * 
		 * Invalid Overloaded Methods
		 * 
		 * Parameter names are not important when determining if a method is overloaded.
		 * 
		 * Nor are return types used when determining if a method is unique.
		 * 
		 * public static void doSomething(int parameterA){
		 * 	// method body
		 * }
		 * 
		 * public static int doSomething(int parameterB){
		 * 	// method body
		 * } ▶ The only difference in the method is the parameter name.
		 * 		This method has the same number of parameters, and same type, as the first doSomething method.
		 * 		and therefore this is not a valid overloaded method. => This will cause a compiler error
		 * 
		 * public static void doSomething(int parameterA){
		 * 	// method body
		 * } ▶ This one has a different return type.
		 * 		But return type is not used in the determination of whether a method signature is unique,
		 * 		 and so, this method too will cause a compiler error.
		 * */
		
		// calculateScore("Minji", 500);
		
		int newScore = calculateScore("Minji", 500);
		System.out.println("New score is "+ newScore);
		
		calculateScore(75);
		calculateScore("100", 100);
		calculateScore();
		
		System.out.println("New score is "+ calculateScore("mini", 500));
		System.out.println("New score is "+ calculateScore(10));
	}
	
	public static int calculateScore(String playerName, int score) {
		System.out.println("Player "+ playerName + " scored " + score + " points");
		return score * 1000;
	}
	/*
	public static int calculateScore(int score) {
		System.out.println("Unnamed player scored " + score + " points");
		return score * 1000;
	}*/
	
	public static int calculateScore() {
		System.out.println("No player name, no player score.");
		return 0;
	}
	
	public static int calculateScore(int score) {
		
		return calculateScore("Anonymous", score);
	}
	
}
