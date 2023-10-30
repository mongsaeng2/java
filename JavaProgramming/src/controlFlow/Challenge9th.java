package controlFlow;

public class Challenge9th {

	public static void main(String[] args) {
		System.out.println("FINAL : " + numberToWords(1010));
	}
	
	public static int getDigitCount(int number){
		int count = 1;
			if(number < 0) {
				count = -1;
			}
			while(number > 0) {
				number = number / 10;
				count++;
			}
		return count;
	}
	
	public static int reverse(int number) {
		int times = getDigitCount(number);
		String reversedString = "";
		System.out.println("times : " + times);
		for (int i = 1; i <= times; i++) {
			System.out.println("for_i : " + i);
			reversedString += (number % 10);
			System.out.println("reversedString : " + reversedString);
			number = number / 10;
			System.out.println("number : " + number);
		}
		return Integer.parseInt(reversedString);
	}
	
	public static String numberToWords(int number) {
		number = reverse(number);
		String result = "";
		if(number < 10) {
			result = "Zero Zero";
		} else if (number < 0) {
			return "Invalid Value";
		}
		System.out.println("result_afterIF : " + result);
		System.out.println("doing reversing : " + number);
		int times = getDigitCount(number);
		for (int i = 0; i <= times; i++) {
			if(number % 10 >= 0) {
				switch(number % 10) {
				case 0 :
					result += "Zero";
					break;
				case 1 :
					result += "One";
					break;
				case 2 :
					result += "Two";
					break;
				case 3 :
					result += "Three";
					break;
				case 4 :
					result += "Four";
					break;
				case 5 :
					result += "Five";
					break;
				case 6 :
					result += "Six";
					break;
				case 7 :
					result += "Seven";
					break;
				case 8 :
					result += "Eight";
					break;
				case 9 :
					result += "Nine";
					break;
				}
				System.out.println("result_afterSWITCH : " + result);
				number = number / 10;
			}	
		}
		
		
		return result;
	}
}
