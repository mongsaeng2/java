package firstAssignment;

public class GreatCircle {

	public static void main(String[] args) {
		
		// 3. Floating-point numbers and the Math library
		/*
		double x1 = Math.toRadians(Double.parseDouble(args[0]));
		double x2 = Math.toRadians(Double.parseDouble(args[1]));
		double y1 = Math.toRadians(Double.parseDouble(args[2]));
		double y2 = Math.toRadians(Double.parseDouble(args[3]));
		*/
		double r = 6371.0;
		
		double x1 = Math.toRadians(40.35);
		double x2 = Math.toRadians(74.65);
		double y1 = Math.toRadians(48.87);
		double y2 = Math.toRadians(-2.33);

		
		double distance = 2 * r * Math.asin(Math.sqrt(
                Math.pow(Math.sin((x2 - x1) / 2), 2) +
                Math.cos(x1) * Math.cos(x2) * Math.pow(Math.sin((y2 - y1) / 2), 2)
        ));
		
        System.out.println(distance + " kilometers");

	}

}
