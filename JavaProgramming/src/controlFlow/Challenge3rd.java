package controlFlow;

public class Challenge3rd {

	public static void main(String[] args) {
		System.out.println("final : " + getEvenDigitSum(212));
	}
	
	public static int getEvenDigitSum(int number) {
		
		int restNumber = 0;
		int total = 0;
		
		if(number <0) {
			return -1;
		}
		
		while(number > 0) {
			System.out.println("while number: "+ number);
			restNumber = number % 10;
			System.out.println("restNumber : "+ restNumber);
			
			if(restNumber %2 == 0) {
				total += restNumber;
			}
			number /= 10;
			if(number == 0) {
				break;
			}
		}
		return total;
	}

}
