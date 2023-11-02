package controlFlow;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		int currentYear = 2023;
		String usersDateOfBirth = "1990";
		
		int dateOfBirth = Integer.parseInt(usersDateOfBirth);
			// Integer.parseInt = classname.static_method_name()
		
		System.out.println("Age = " + (currentYear - dateOfBirth));
		
		String userAgeWIthPartialYear = "33.5";
		double ageWithPartialYear = Double.parseDouble(userAgeWIthPartialYear);
		System.out.println("The user says she's " + ageWithPartialYear);
		
		try {
		System.out.println(getInputFromConsole(currentYear));
		} catch (NullPointerException e) {
		System.out.println(getInputFromScanner(currentYear));
		}
	}

	// will calculate using date of birth
	public static String getInputFromConsole(int currentYear) {
		
		String name = System.console().readLine("Hi, What's your Name?");
		System.out.println("Hi " + name + ", Thanks for taking the course!");
		
	String dateOfBirth = System.console().readLine("WHat year were you born?");
	int age = currentYear - Integer.parseInt(dateOfBirth);
	
		return "So you are " + age + " years old";
	}
	
	public static String getInputFromScanner(int currentYear) {
		
		Scanner scanner = new Scanner(System.in);
		
		// String name = System.console().readLine("Hi, What's your Name?");
		System.out.println("Hi, What's your Name?");
		String name = scanner.nextLine();
		System.out.println("Hi " + name + ", Thanks for taking the course!");
		
		// String dateOfBirth = System.console().readLine("WHat year were you born?");
		System.out.println("What year were you born?");
		
		boolean validDOB = false;
		int age = 0;
		
		do {
			System.out.println("Enter a year of birth >=" + (currentYear - 125) + " and <=" + (currentYear));

			try {
			age = checkData(currentYear, scanner.nextLine());
			validDOB = age < 0 ? false : true;
			} catch (NumberFormatException badUserData) {
				System.out.println("Characters not allowed!!! Try again.");
			}
		} while(!validDOB);
		// we have a boolean variable that is false, and we'll be looping, until that condition in the while parentheses, becomes false.
		
		
	
		return "So you are " + age + " years old";
	}
	
	public static int checkData(int currentYear, String dateOfBirth) {
		
		int dob = Integer.parseInt(dateOfBirth);
		int minimumYear = currentYear - 125;
		
		if((dob < minimumYear) || (dob > currentYear)) {
			return -1;
		}
		
		return (currentYear - dob);
	}
}
