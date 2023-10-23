package controlFlow;

// 2023. 10. 19. 4-1, 2, 3

public class switchStatement {

	public static void main(String[] args) {
		
//		int value = 1;
//		if (value ==1) {
//			System.out.println("Value was 1");
//		}else if (value == 2) {
//			System.out.println("Value was 2");
//		} else {
//			System.out.println("Was not 1 or 2");
//		}
		
		int switchValue = 3;
		switch (switchValue) {
			case 1:
				System.out.println("switchValue was 1");
				break;
			case 2:
				System.out.println("switchValue was 2");
				break;
			case 3: case 4: case 5:
				System.out.println("Was a 3, a 4, or a 5");
				System.out.println("Actually it was a " + switchValue);
				break;
			default:
				System.out.println("It wasn't 1, 2, 3, 4, or 5");
				break;
		}

		String month = "2023";
		System.out.println(getQuarter(month) + " quarter");
		
		//==========
		
		char letter = 'A';
		System.out.println(letter + " is a "+replaceAChar(letter));
		
	}
	
	public static String getQuarter(String month) {
		
		switch(month) {
			case "January": case "February": case "March":
				return "1st";
			case "April": case "May": case "June":
				return "2nd";
			case "July": case "August": case "September":
				return "3rd";
			case "October": case "November": case "December":
				return "4th";
		}
		
		String badResponse = month + " is bad";
		return badResponse;
		
	}
	
	public static String replaceAChar(char letter) {
		
		switch(letter) {
			case 'A':
				return "Able";
			case 'B':
				return "Baker";
			case 'C':
				return "Charlie";
			case 'D':
				return "Dog";
			case 'E':
				return "Easy";
			default:
				return "Not found";
		}
	}
	
	
	}

