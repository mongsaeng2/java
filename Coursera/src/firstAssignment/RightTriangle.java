package firstAssignment;

public class RightTriangle {

	public static void main(String[] args) {
		
		// 2. Integers and booleans
		
		int a;
		int b;
		int c;
		boolean result = false;
		
		a = 3;
		b = 4;
		c = 5;
		if(a <= 0 || b <= 0 || c <= 0) {
			result = false;
		}else if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
	        result = true;
	    } else {
	        result = false;
	    }
		
		System.out.println(result);

	}

}
