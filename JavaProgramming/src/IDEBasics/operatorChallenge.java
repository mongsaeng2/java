package IDEBasics;

//2023.09.19. #2-8

/* LINK 1: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html
 * LINK 2: https://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html */

public class operatorChallenge {

	public static void main(String[] args) {
		
		/* CHALLENGE
		 * Step 1: create a double variable with a value of 20.00
		 * Step 2: create a second variable of type double with a value 80.00
		 * Step 3: add both numbers together, then multiply by 100.00
		 * Step 4: use the remainder operator, to figure out what the remainder from the result of the operation in step three, and 40.00, will be
		 * Step 5: create a boolean variable that assigns the value true, if the remainder in step four is 0.00, or false if it's not zero.
		 * Step 6: output the boolean variable just to see what the result is.
		 * Step 7: write an if-then statement that displays a message, 'got some remainder', if the boolean in step five is not true.
		 * */
		
		// my answer
		
		//Step 1
		double firstVariable = 20.00;
		//Step 2
		double secondVariable = 80.00;
		//Step 3
		double result = (firstVariable + secondVariable) * 100.00;
		System.out.println(result);
		//Step 4
		double remainder = result % 40.00;
		System.out.println(remainder);
		//Step 5
		boolean booleanVariable = (remainder == 0.00) ? true : false;
		System.out.println(booleanVariable);
		//Step 6
		if (!booleanVariable) {
			System.out.println("got some remainder");
		}
		
		// real answer
		double myFirstValue = 20.00d;
		double mySecondValue = 80.00d;
		double myValuesTotal = (myFirstValue + mySecondValue) * 100.00d;
		System.out.println("MyValuesTotal = "+myValuesTotal);
		double theRemainder = myValuesTotal % 40.00d;
		System.out.println("theRemainder = " + theRemainder);
		boolean isNoRemainder = (theRemainder ==0)?true:false;
		System.out.println("isNoRemainder = "+isNoRemainder);
		if(!isNoRemainder) {
			System.out.println("Got some remainder");
		}
		// precedence is the key
		

	}

}
