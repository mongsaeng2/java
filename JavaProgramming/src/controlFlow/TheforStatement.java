package controlFlow;

public class TheforStatement {

	public static void main(String[] args) {
		
		/*
		for(int counter = 1; counter <= 5; counter++) {
			System.out.println(counter);
		}

		System.out.println("10,000 at 2% interest = " + calculateInterest(10000, 2));
		System.out.println("10,000 at 3% interest = " + calculateInterest(10000, 3));
		System.out.println("10,000 at 4% interest = " + calculateInterest(10000, 4));
		System.out.println("10,000 at 5% interest = " + calculateInterest(10000, 5));
		*/
		
		for(double rate = 7.5; rate <= 10.0; rate+=0.25) {
			double interestAmount = calculateInterest(100.0, rate);
			if(interestAmount > 8.5) {
				break;
			}
			System.out.println("$100.00 at " + rate + "% interest = $" + interestAmount);
		}
	
	}

	public static double calculateInterest(double amount, double interestRate) {
		
		return (amount * (interestRate / 100));
	}
}
