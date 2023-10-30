package controlFlow;

public class Challenge9thGPTver {

	public static void main(String[] args) {

	}
	public static int getDigitCount(int number) {
	    if (number < 0) {
	        return -1;
	    }
	    if (number == 0) {
	        return 1;
	    }
	    int count = 0;
	    while (number > 0) {
	        number = number / 10;
	        count++;
	    }
	    return count;
	}

	public static int reverse(int number) {
	    int reversed = 0;
	    while (number != 0) {
	        int digit = number % 10;
	        reversed = reversed * 10 + digit;
	        number /= 10;
	    }
	    return reversed;
	}

	public static String numberToWords(int number) {
	    if (number < 0) {
	        return "Invalid Value";
	    }
	    if (number == 0) {
	        return "Zero";
	    }
	    number = reverse(number);
	    String result = "";
	    while (number > 0) {
	        int digit = number % 10;
	        switch (digit) {
	            case 0:
	                result += "Zero ";
	                break;
	            case 1:
	                result += "One ";
	                break;
	            case 2:
	                result += "Two ";
	                break;
	            case 3:
	                result += "Three ";
	                break;
	            case 4:
	                result += "Four ";
	                break;
	            case 5:
	                result += "Five ";
	                break;
	            case 6:
	                result += "Six ";
	                break;
	            case 7:
	                result += "Seven ";
	                break;
	            case 8:
	                result += "Eight ";
	                break;
	            case 9:
	                result += "Nine ";
	                break;
	        }
	        number /= 10;
	    }
	    return result.trim();
	}


}
