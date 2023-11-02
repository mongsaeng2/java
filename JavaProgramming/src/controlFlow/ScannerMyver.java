package controlFlow;

import java.util.Scanner;

public class ScannerMyver {

	public static void main(String[] args) {
		
		// getInputFromScanner(); // method 호출만 함 - method가 반환하는 값을 저장하거나 출력하지 않음
		System.out.println(getInputFromScanner()); // method를 호출하고, 반환값을 콘솔에 출력함

	}
	
	// Getting Input Data Using Scanner
	public static String getInputFromScanner() {
		
		Scanner scanner = new Scanner(System.in);
		int age = 0;
		int currentYear = 2023;
		
		boolean validDOB = false;

		
		System.out.println("What is your name?");
			String name = scanner.nextLine();
		System.out.println("What year were you born?");
			String dateOfBirthYear = scanner.nextLine();
			
		do {
			System.out.println("Please enter a valid year of birth >= " + (currentYear - 125) + " and <= " + currentYear);
			try {
				age = checkData(currentYear, scanner.nextLine());
				validDOB = age < 0 ? false : true;
			} catch (NumberFormatException badUserData) {
				System.out.println("Invalid Year data. Try again!");
			}
		} while(!validDOB); // do {}를 반복해라 언제까지? !validDOB => validDOB = true까지
		
		// age = currentYear - Integer.parseInt(dateOfBirthYear);
		
		return "So you are " + age + "years old:)";
	}
	
	// To prevent invalid value
	public static int checkData(int currentYear, String dateOfBirthYear) {
		int dob = Integer.parseInt(dateOfBirthYear);
		int minimumYear = currentYear - 125;
		
		if((dob < minimumYear) || (dob > currentYear)) {
			return -1;
		}
		return (currentYear - dob);
	}

}
