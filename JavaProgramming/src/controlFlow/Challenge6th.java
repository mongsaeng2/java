package controlFlow;

public class Challenge6th {

	public static void main(String[] args) {
		
	}
	
	public static void printFactors(int number) {
		
		if(number < 0) {
			System.out.println("Invalid Value");
		}
		
		int i = 0;
		
		for(i = 1; i <= number; i++) {
			
			while(number % i == 0) {
				System.out.println(i);
				break;
			}
		}
		
	}

}
