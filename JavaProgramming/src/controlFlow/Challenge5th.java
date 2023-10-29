package controlFlow;

public class Challenge5th {

	public static void main(String[] args) {
		
	}
	    public static boolean hasSameLastDigit(int x, int y, int z) {
	        if (!isValid(x) || !isValid(y) || !isValid(z)) {
	            return false;
	        }

	        int lastDigitX = x % 10;
	        int lastDigitY = y % 10;
	        int lastDigitZ = z % 10;

	        return (lastDigitX == lastDigitY || lastDigitX == lastDigitZ || lastDigitY == lastDigitZ);
	    }

	    
	    public static boolean isValid(int number) {
	        return number >= 10 && number <= 1000;
	    }
	}