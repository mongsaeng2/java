package FirstStep;

// 2023.09.15. #13

public class abbreviatingOperators {

	public static void main(String[] args) {
		
		{
			int result = 1;
			result = result + 1;
			System.out.println("result = " + result);
		}
		
		/* Incrementing by One
		 * 
		 * Incrementing by one is a very common requirement in programming.
		 *		result = result + 1;
		 *
		 *		two other shorthand ways to do this same thing:
		 *		
		 *		Shorthand (or Abbreviating) Operator
		 *		Post-fix Increment Operator ▶ result++;
		 *		Compound Assignment Operator with + sign ▶ result+=1;	*/
		
		{
			int result = 1;
			result++;
			System.out.println("result = " + result);
		}

		/* Decrementing by One
		 * 
		 * Decrementing by one is also very common
		 * 		result = result - 1;
		 * 		Shorthand (or Abbreviating) Operator
		 *		Post-fix Decrement Operator ▶ result--;
		 *		Compound Assignment Operator with - sign ▶ result-=1;	*/
		
		{
			int result = 1;
			result-=1;
			System.out.println("result = " + result);
		}
		
		{
			int result = 1;
			result+=5;
			System.out.println("result = " + result);
		}
		
		/* Compound Assignment Operator Challenge
		 * 
		 * Initialize an int variable, named result, to the value of 10, rather than 1.
		 * Next, use the compound assignment operator, with the minus sign, to subtract a number from result, using value of your choice.
		 * Print the result out, using the sysout.*/
		
		// my answer = lecture answer
		int result = 10;
		result -= 7;
		System.out.println("result : " + result);
		
		
		/* Compound Assignment Operator
		 * 
		 * The compound assignment operator
		 * 	x -= y
		 * is often said to be
		 * 	x = x - y
		 * but that's not entirely true if y is not the same data type as x.
		 * 	x -= y
		 * is really
		 * 	x = (data type of x) (x - y)
		 *
		 * An implicit cast is done when using this operator, so no error occurs, but unexpected results may occur.
		 **/

		result = 10;
		//result -=5.5;
		result = (int)(result - 5.5);
		System.out.println("result : " + result);
		
		double resultTry = 10;
		resultTry -=5.5;
		System.out.println("resultTry : " + resultTry);
		
		resultTry = 10;
		resultTry *=5.5;
		System.out.println("resultTry : " + resultTry);
		
		resultTry = 10;
		resultTry /=5.5;
		System.out.println("resultTry : " + resultTry);
		
		
	}

}
