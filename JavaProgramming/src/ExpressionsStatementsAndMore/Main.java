package ExpressionsStatementsAndMore;

// 2023. 09. 19. # 3-1, 2

public class Main {

	public static void main(String[] args) {
		
		// Expressions, Statements, Code Blocks and Methods are four really key components of Java.
		
		/* Keywords and Expressions
		 * 
		 * Java's Code Units
		 * Writing code is similar to writing a document.
		 * It consists of special hierarchical units, which together form a whole.
		 * These are:
		 * The Expression -An expression computes to a single value.
		 * The Statement -Statements are stand alone units of work.
		 * And Code Blocks -A code block is a set of zero, one, or more statements, usually grouped together in some way to achieve a single goal.*/
		
		double kilometers = (100 * 1.6909344);
		// This entire line of code is a valid statement.
		// For that line, the actual expression is this component of the entire line.
		// The data type does not form part of an expression, but everything else on the line typically forms, or is part of the expression.
		// So the expression component can include variables, values, and operators.
		
		int highScore = 50;
		if (highScore >25) {
			highScore = 1000 + highScore; // add bonus points
		}
		
		int health = 100;
		if((health < 25) && (highScore >1000)) {
			highScore = highScore - 1000;
		}

	}

}
