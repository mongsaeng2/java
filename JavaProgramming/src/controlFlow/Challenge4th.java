package controlFlow;

public class Challenge4th {

	public static void main(String[] args) {
		
		System.out.println("12, 43 : " + hasSharedDigit(5,55));

	}
	
	public static boolean hasSharedDigit(int i, int j) {
		
		boolean result = false;
		int restI = 0;
		int restJ = 0;
		
		if(i < 11 || i > 100 || j < 11 || j > 100) {
			if(restI == restJ) {
				System.out.println("restI : " + restI);
				System.out.println("restJ : " + restJ);
				result = true;
				System.out.println("result : " + result);
			} else {
				result = false;
			}
			return result;
		} 
		
		while (i > 0 || j > 0) {
			
			restI = i % 10;
			restJ = j % 10;
			System.out.println("restI : " + restI);
			System.out.println("restJ : " + restJ);
			
			break;
		}
		
		return result;
	}

}
