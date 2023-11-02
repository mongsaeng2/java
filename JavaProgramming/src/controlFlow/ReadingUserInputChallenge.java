package controlFlow;

import java.util.Scanner;

public class ReadingUserInputChallenge {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		
		for(int i = 1; i < 6; i++) {
			System.out.println("Enter number #" + i + ":");
			try {
			int number = Integer.parseInt(scanner.nextLine());
			sum += number;
			System.out.println("Total : " + sum);
			} catch(NumberFormatException invalidInput){
				System.out.println("Invalid Number");
				i--;
			}
		}

	}

}
