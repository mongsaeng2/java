package controlFlow;

// 2023. 10. 21. # 4-5

public class SwitchChallenge2nd {

	/* Day of the Week Challenge
	 * 
	 * 1. Create a method called printDayOfWeek, that takes an int parameter called day,
	 * 	but doesn't return any values.
	 * 	- 0 will return "Sunday", 1 will return "Monday", and so on.
	 * 		Any number not between 0 and 6, should return "Invalid Day".
	 *  - returning the result to a String named dayOfTheWeek.
	 *  - Print both the day variable and the dayOfTheWeek variable
	 * 2. In the main method, call this method for the values 0 through 7.
	 * 3. Create a second method called printWeekDay, that uses an if then else statement,
	 * 	 instead of a switch, to produce the same output.*/
	
	public static void main(String[] args) {
		
		printDayOfWeek(1);
		printWeekDay(0);
		
	}
	/* my answer
	public static String printDayOfWeek(int day) {
		
		switch(day) {
			case 0:
				return "Sunday";
			case 1:
				return "Monday";
			case 2:
				return "Tuesday";
			case 3:
				return "Wednesday";
			case 4:
				return "Thursday";
			case 5:
				return "Friday";
			case 6:
				return "Saturday";
			default:
				return "Invalid Day";
		}
		
	} */
	
	public static String printDayOfWeek(int day) {
	    String dayOfWeek;
	    switch (day) {
	        case 0:
	            dayOfWeek = "Sunday";
	            break;
	        case 1:
	            dayOfWeek = "Monday";
	            break;
	        case 2:
	            dayOfWeek = "Tuesday";
	            break;
	        case 3:
	            dayOfWeek = "Wednesday";
	            break;
	        case 4:
	            dayOfWeek = "Thursday";
	            break;
	        case 5:
	            dayOfWeek = "Friday";
	            break;
	        case 6:
	            dayOfWeek = "Saturday";
	            break;
	        default:
	            dayOfWeek = "Invalid Day";
	            break;
	    }
	    System.out.println(day+" stands for "+ dayOfWeek);
	    return dayOfWeek;
	}

	
	public static void printWeekDay(int day) {
	/* my answer	
		if(day == 0) {
			return "Sunday";
		} else if(day == 1) {
			return "Monday";
		} else if(day == 2) {
			return "Tuesday";
		} else if(day == 3) {
			return "Wednesday";
		} else if(day == 4) {
			return "Thursday";
		} else if(day == 5) {
			return "Friday";
		} else if(day == 6) {
			return "Saturday";
		} else {
			return "Invalid Day";
		} */
	
		String dayOfWeek = "Invalid Day";
		if(day == 0) {
			dayOfWeek = "Sunday";
		} else if (day == 1) {
			dayOfWeek = "Monday";
		} else if(day == 2) {
			dayOfWeek =  "Tuesday";
		} else if(day == 3) {
			dayOfWeek =  "Wednesday";
		} else if(day == 4) {
			dayOfWeek =  "Thursday";
		} else if(day == 5) {
			dayOfWeek =  "Friday";
		} else if(day == 6) {
			dayOfWeek =  "Saturday";
		} 
		
		System.out.println(day + " stands for " + dayOfWeek);
	
	}
	
	

}
