package FirstStep;

//2023.09.13. #7

public class primitiveTypesChallenge {

	public static void main(String[] args) {
		
		/*Your Challenge is to create four new variables:
		 * A byte variable, set it to any valid byte number
		 * A short variable, set it to any valid short number
		 * An int variable, set it to any valid integer number
		 * Lastly, create a variable of type long.
		 * 	Make it equal to 50,000 plus 10 times the sum of the values of the first 3 variables*/
		
		// my answer
		byte firstValue = 10;
		short secondValue = 30;
		int thirdValue = 53;
		long fourthValue = 50000 + (10*(firstValue + secondValue + thirdValue));
		System.out.println(firstValue);
		System.out.println(secondValue);
		System.out.println(thirdValue);
		System.out.println(fourthValue);

		// lecture answer
		byte byteValue = 10;
		short shortValue = 20;
		int intValue = 50;
		long longTotal = 50000L + 10L * (byteValue + shortValue + intValue) ;
		System.out.println(longTotal);
			/*()안에 값의 결과가 int타입으로 나올 것으로 예상되지만
			 * 	long과 int 간의 연산에서 Java는 자동으로 큰 자료형인 long으로 형변환(casting)하므로 결과값이 long타입으로 캐스팅 되어 캐스팅 에러가 발생하지 않음*/
		
		int sumOfThree = byteValue + shortValue + intValue;
		longTotal = 50000L + (10*sumOfThree);
			// Parentheses are another way to make your code more readable.
			// They also make it clear which calculation should be done first.
		System.out.println(longTotal);
		
		//short shortTotal = (1000 + 10 * (byteValue + shortValue + intValue));
			/*모든 값이 int로 되어 있기 때문에 결과값이 int로 예상되지만
			 *	그 결과를 short변수에 할당하려고 하면 형변환이 필요하므로 수동으로 처리해야함*/
		short shortTotal = (short)(1000 + 10 * (byteValue + shortValue + intValue));
		System.out.println(shortTotal);
	}

}
