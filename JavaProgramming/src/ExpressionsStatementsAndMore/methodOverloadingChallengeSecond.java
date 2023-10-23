package ExpressionsStatementsAndMore;

public class methodOverloadingChallengeSecond {

	/* Seconds and Minutes Challenge
	 * 
	 * We want to create two methods with the same name: getDurationString
	 * The first method has one parameter of type int, named seconds.
	 * The second method has two parameters, named minutes and seconds, both ints.
	 * Both methods return a String in the format shown:
	 * XXh YYm ZZs
	 * where XX represents the number of hours, YY the number of minutes, and ZZ the number of seconds.
	 * The first method should in turn call the second method to return its results.
	 * 
	 * Make both methods public and static
	 * */
	
	public static void main(String[] args) {

		System.out.println(getDurationString(-3945)); // first method results
		System.out.println(getDurationString(65, 245)); // This is the second case
		System.out.println(getDurationString(65, 145)); // This is the second case
		System.out.println(getDurationString(65, 45)); // This is the second case
		System.out.println(getDurationString(3945));
	}
	
	public static String getDurationString(int seconds) {
		/* My answer
		int minutes;
		int hours;
		
		if (seconds < 0) {
			return "Please type valid number for first Method";
		}
		
		hours = seconds / 60 / 60;
		minutes = (seconds / 60) % 60;
		seconds = seconds - (hours * 60 * 60) - (minutes * 60);
		
		return hours + "h " + minutes + "m " + seconds +"s";
		*/
		
		/* lecture answer ver 1
			// Two step approach to get hours
		int minutes = seconds / 60;
		int hours = minutes / 60;
		System.out.println("hours = " + hours);
			
			// One step approach to get hours
		int hours1 = seconds / 3600;
		System.out.println("hours1 = "+ hours1);
		
		int remainingMinutes = minutes % 60;
		System.out.println("minutes = " + minutes);
		System.out.println("remainingMinutes = " + remainingMinutes);
		
		int remainingSeconds = seconds % 60;
		System.out.println("remainingSeconds = " + remainingSeconds);
		
		return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";
		*/
		if(seconds < 0 ) {
			return "Invalid data for seconds(" + seconds
					+ "), must be a positive integer value";
		} else {
			int minutes = seconds / 60;
			return getDurationString(seconds / 60, seconds % 60);
			// because of the 2nd method, i had to change the parameters like these.
		}
	}

	public static String getDurationString(int minutes, int seconds) {
		
		/* my answer
		if(seconds < 0 || seconds >59) {
			return "Please type valid number for second Method";
		}
		int totalSeconds = minutes * 60 + seconds; 
		return getDurationString(totalSeconds);
		*/
		
		// lecture answer
		if(minutes < 0) {
			return "Invalid data for minutes(" + minutes
					+ "), must be a positive integer value";
		}
		
		if(seconds <=0 || seconds >= 59) {
			return "Invalid data for seconds(" + seconds
					+ "), must be between 0 and 59";
		}
		int hours = minutes / 60;

		int remainingMinutes = minutes % 60;
		// int remainingSeconds = seconds % 60;
			// Because of the change in first method, this one is not needed.
		
		return hours + "h " + remainingMinutes + "m " + seconds + "s";
	}

}
