package controlFlow;

public class TheforStatementChallenge {

	public static void main(String[] args) {

		// step 1) need prime number counter
		int count = 0;
		
		//step 2) range 10 to 50
		for(int i = 10; count < 3 && i<= 50; i++) {
			// step 3)
			if(isPrime(i)) {
				System.out.println(i+" is a prime number");
				count++;
			}
		}
		// System.out.println("Total number of prime numbers between 10 and 50 is " + count);
		
	}
	
	public static boolean isPrime(int wholeNumber) {
		// if wholeNumber is prime number, it will return true.
		
		if(wholeNumber <= 2) {
			return (wholeNumber == 2);
		}
		
		for(int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
			// we create a variable called divisor, this is the number we'll be dividing the wholeNumber by.
			
			if(wholeNumber % divisor == 0) {
				return false; // 나머지가 0이면 소수가 아니다
			}
		}
		
		return true;
	}

}
