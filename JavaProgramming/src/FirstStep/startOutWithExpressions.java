package FirstStep;

// 2023.09.13. #3

public class startOutWithExpressions {
	
	public static void main(String[] args) {
		
		int myFirstNumber = (10+5)+(2*10);
		
		int mySecondNumber = 12;
		int myThirdNumber = 6;
		
		int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
		
		System.out.println(myTotal);
		
		myThirdNumber = myFirstNumber * 2;
		
		System.out.println(myThirdNumber);
		
		myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
		System.out.println(myTotal);
		
		
		int myLastOne = 1000 - myTotal;
		
		System.out.println(myLastOne);
	}

}
