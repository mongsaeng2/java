package ComputerScience_ProgrammingWithAPurpose;

// 2023. 09. 26.

public class basic_01 {

	public static void main(String[] args) {
		/*
		int N = Integer.parseInt(args[0]); // String to int (system method)
		double r = Math.random();
		int t = (int) (r * N);
				// double to int (cast)  // N : int to double (automatic)
		
		System.out.println(t);
		*/
		//Optional Enrichment on Basic Programming Concepts
		
		/* Uniform random numbers. Write a program that prints five uniform random numbers
		 * 	between 0 and 1, their average value, and their minimum and maximum values.
		 * Use Math.random(), Math.min(), and Math.max().
		 * For these two exercises, use only Java features
		 * 	that we have introduced in this course so far (e.g,. no loops or conditionals).*/
		
		 double sum = 0;
	        double min = 1.0;  // Initialize min to a value greater than 1
	        double max = 0;     // Initialize max to a value smaller than 0

	        System.out.println("Five random numbers between 0 and 1:");

	        for (int i = 0; i < 5; i++) {
	            double randomValue = Math.random();
	            System.out.println(randomValue);
	            sum += randomValue;
	            min = Math.min(min, randomValue);
	            max = Math.max(max, randomValue);
	        }

	        double average = sum / 5;

	        System.out.println("\nAverage: " + average);
	        System.out.println("Minimum: " + min);
	        System.out.println("Maximum: " + max);
		
		/* Three-sort. Write a program that takes three integer command-line arguments and
		 * 	prings them in ascending order. Use Math.min() and Math.max().*/

	}

}
