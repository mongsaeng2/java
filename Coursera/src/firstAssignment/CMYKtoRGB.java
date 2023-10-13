package firstAssignment;

public class CMYKtoRGB {

	public static void main(String[] args) {
		
		// 4. Type conversion
		
		int R, G, B;
		
		double C, M, Y, K;
		
		K = 0;
		C = 0.0;
		M = 1.0;
		Y = 0.0;
		K = 0.0;
		
		int white = (int) (1- K);
		R = (int) (255 * white * (1 - C));
		G = (int) (255 * white * (1 - M));
		B = (int) (255 * white * (1 - Y));
		
		System.out.println("red = "+R);
		System.out.println("green = "+G);
		System.out.println("blue = "+B);
		
		
		
		
	}

}
