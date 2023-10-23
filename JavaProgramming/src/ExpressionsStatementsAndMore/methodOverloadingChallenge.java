package ExpressionsStatementsAndMore;

// 2023. 10. 10. # 3-12

public class methodOverloadingChallenge {

	/* Overloaded Method Challenge Instructions
	 * 
	 * Create two methods with the same name: convertToCentimeters
	 * 
	 * 	The first method has one parameter of type int, which represents the entire height in inches. You'll convert inches to centimeters, in this method, and pass back the number of centimeters, as a double.
	 * 
	 * 	The second method has two parameters of type int, one to represent height in feet, and one to present the remaining height in inches. So if a person is 5 foot, 8 inches, the value 5 for feet and 8 for inches woyld be passed to this method. This method will convert feet and inches to just inches, then call the first method, to get the number of centimeters, also returning the value as a double.
	 * 
	 * 	Both methods should return a real number or decimal value for total height in centimeters.
	 * 
	 *  Call both methods, and print out the results.
	 *  
	 *  The conversion formula from inches to centimeters is 1 inch = 2.54 cm.
	 *  Also, one foot = 12 inches.
	 *  
	 * */
	
	// My Answer
	
	public static void main(String[] args) {
		
		System.out.println(convertToCentimeters(34));
		System.out.println(convertToCentimeters(5,3));
		
		System.out.println("5ft, 8in = " + convertToCentimeters(5,8) + "cm");
		System.out.println("68in = " + convertToCentimeters(68) + "cm");

	}
	
	public static double convertToCentimeters(int inches) {
		/* My answer
		double result = inches * 2.54;
		System.out.println("The hight is " + result + "cm.");
		return result;*/
		
		// Lecture answer
		return inches * 2.54;
	}
	
	public static double convertToCentimeters(int feet, int inches) {
		/* my answer
		double result = (feet * 12 * 2.54) + (inches * 2.54);
		System.out.println("The final height is "+ result + "cm.");
		return result; */
		
		/* lecture answer ver1
		return ((feet * 12) + inches) * 2.54;
		*/
		
		/* lecture answer ver2
		return convertToCentimeters((feet * 12) + inches);
		 ▶ 위에 convertToCentimiters를 overloading해서
			int inches자리에 (feet * 12) + inches로
			total inches값을 계산하여 위에 method로 전달
		*/
		
		// final lecture answer
		int feetToInches = feet * 12;
		int totalInches = feetToInches + inches;
		double result = convertToCentimeters(totalInches);
		return result;
	}
	
}
