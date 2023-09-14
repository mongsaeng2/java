package FirstStep;

//2023.09.14. #11

public class primitiveTypesRecapAndString {

	public static void main(String[] args) {
		
		/*Handling Data in Java
		 * 
		 * Java's Primitives
		 * 	- boolean, byte, char, double, float, int, long, short
		 * 
		 * Java's Built-in Classes
		 *  - Wrappers (Boolean, Byte, Character, etc.)
		 *    BigDecimal
		 *    String
		 *
		 * Your Classes
		 * 
		 * Somebody Else's Classes
		 * */
		
		/*String
		 * A String is a class that contains a sequence of characters.*/
		
		String myString = "This is a string";
		System.out.println("myString is equal to " + myString);

		myString = "This is a string, and this is more.";
		System.out.println("myString is equal to " + myString);
		
		myString = "I wish I had \u00241,000,000.00";
		System.out.println(myString);
		
		String numberString = "250.55";
		numberString = numberString + "49.95";
		System.out.println(numberString);
		
		String lastString = "10";
		int myInt = 50;
		
		lastString = lastString + myInt;
		System.out.println(lastString);
		/*String concatenation
		 * In Java, the + symbol is an operator which can mean addition, if used for numbers.
		 * But it also means concatenation when applied to a String.
		 * A String + anything else, gives us a String as a result,
		 *  concatenation anything after the String as text to the initial String.*/
		
		double doubleNumber = 120.47;
		lastString = lastString + doubleNumber;
		System.out.println(lastString);
		
		/*Strings are Immutable
		 * Immutable means that you can't change a String after it's created.
		 * So in the case of the code we've written,
		 *  the value 120.47 is technically not appended to the current contents of lastString.*/
		
		/*String vs StringBuilder
		 * 
		 * The String class is immutable, but can be used much like a primitive data type.
		 * The StringBuilder class is mutable, but does not share the String's special features,
		 * 	such as being able to assign it a String literal or use the + operator on it.
		 * 
		 * Both are classes, but the STring class is in a special category in the Java language.
		 * 
		 * The String is so intrinsic to the Java language, it can be used like a 9th primitive type.
		 * 	But it's not a primitive type at all, it's a class.
		 * */
		
	}

}
