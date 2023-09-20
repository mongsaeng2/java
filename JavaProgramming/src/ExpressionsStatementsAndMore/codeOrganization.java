package ExpressionsStatementsAndMore;

// 2023. 09. 20. # 3-3

public class codeOrganization {

	public static void main(String[] args) {
		
		/* Statements, Whitespace and Indentation (Code Organization)
		 * */

		int myVariable = 50; // statement: entire line
		
		myVariable++;
		myVariable--;
		
		System.out.println("This is a test");
		System.out.println("This is" +
				" another"+
				" still more.");
		
		int anotherVariable = 50; myVariable--; System.out.println("myVariable = " + myVariable);
		
		/* Whitespace
		 * Whitespace is any extra spacing, horizontally or vertically, placed around Java source code.
		 * This is for human to read code efficiently.*/
		
		if(myVariable ==0) {
			System.out.println("It's now zero");
		}
		
	}

}
