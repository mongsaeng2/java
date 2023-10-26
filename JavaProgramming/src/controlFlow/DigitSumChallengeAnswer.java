package controlFlow;

public class DigitSumChallengeAnswer {

	public static void main(String[] args) {
		
		// step 1) add test code to print
		System.out.println("The sume of the digits in number 1234 is " + sumDigits(1234));
		System.out.println("The sume of the digits in number -125 is " + sumDigits(-125));
		System.out.println("The sume of the digits in number 4 is " + sumDigits(4));
		System.out.println("The sume of the digits in number 32123 is " + sumDigits(32123));

	}
	
	// step 2) Making a method
	public static int sumDigits(int number) {
		
		if(number < 0) {
			return -1;
		}
		
		int sum = 0;
		
		while (number > 9) {
			sum+= (number % 10);
			number = number / 10;
				// Dividing an integer by 10 effectively drops the most right digit.
				// We still need to add that last digit to sum, and we'll do that outside the loop.
		}
		sum += number;
		
		return sum;
		
	}

}
