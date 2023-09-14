package FirstStep;

// 2023.09.14. #10

public class charAndBoolean {

	public static void main(String[] args) {
		
		char myChar = 'M';
		System.out.println(myChar);
		
		/*Comparing the char to the String
		 * 	1. char
		 * 		Holds one, and only one, character
		 * 		Literal enclosed in Single Quotes
		 *  2. String
		 *  	Can hold multiple characters
		 *  	Literal enclosed in Double Quotes*/
		
		myChar = '민';
		System.out.println(myChar);
		
		char myUnicode = '\u0044';
		System.out.println(myUnicode);
		char myDecimalCode = 68;
		System.out.println(myDecimalCode);
		
		/*Assigning values to a char variable
		 * 	There are three ways to assign a value to a char:
		 * 		Each of these methods, represents storing the letter, capital D, in memory.
		 * 
		 * 	Assignment Type
		 * 		a literal character : char myChar = 'D';
		 * 		a Unicode value : char myChar = '\u0044';
		 * 		a integer value : char myChar = 68;
		 * */
		
		/*The char Challenge
		 * Create three char variables to store the character for the question-mark symbol
		 */
		char mySimpleChar = '?';
		char myUnicodeChar = '\u003F';
		char myDecimalChar = 63;
		
		System.out.printf("my values are %c, %c, %c",mySimpleChar, myUnicodeChar, myDecimalChar);
		
		System.out.println();
		
		/*Boolean Primitive Type
		 * A boolean value allows for two opposite choices, true or false, yes or no, one or zero.
		 * In Java terms, we've got a boolean primitive type, and it can be set to two values only,
		 * 	either true or false.
		 * The wrapper for boolean is Boolean with a capital B.*/
		
		boolean myTrueBooleanValue = true;
		boolean myFalseBooleanValue = false;
		
		System.out.printf("%b, %b", myTrueBooleanValue, myFalseBooleanValue);
		
		boolean isCustomerOverTwentyOne = true;
			// Developers will often use the word, is, as a prefix or a boolean variable name.
			// This creates a name that seems to ask a question, which makes reading the code more intuitive. 
		
		
	}

}
