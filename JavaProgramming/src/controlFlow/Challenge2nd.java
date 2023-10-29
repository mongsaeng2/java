package controlFlow;

public class Challenge2nd {

	public static void main(String[] args) {
		System.out.println("result : "+ sumFirstAndLastDigit(5));
	}
	
	public static int sumFirstAndLastDigit(int number) {
		
		int lastDigit = 0;
		int firstDigit = 0;
		int total = 0;
		
			if(number < 0) {
				return -1;
			}
		
		firstDigit = number % 10;
			System.out.println("fistDigit : " + firstDigit);
		
		if(number <10){
		    total = firstDigit * 2;
		}
		
		while (number >= 10) {
			number = number / 10;
			System.out.println("current number : " + number);
			if(number < 10) {
				lastDigit = number % 10;
				System.out.println("lastDigit : "+ lastDigit);
				total = firstDigit + lastDigit;
				break;
			}
		}
		
		return total;
	}

}
