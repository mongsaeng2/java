package controlFlow;

public class Challenges {

	public static void main(String[] args) {
		/*
		int 처음숫자 = 12321;
		String 저장해보자 = "";
		int 처음마지막자리 = 처음숫자 % 10;
		System.out.println("처음마지막자리 :" + 처음마지막자리);
		저장해보자 += 처음마지막자리;
		System.out.println("저장해보자 : "+ 저장해보자);
		int 처음마지막자리없앰 = 처음숫자 / 10;
		System.out.println("처음마지막자리없앰 : " + 처음마지막자리없앰);
		int 두번째마지막자리 = 처음마지막자리없앰 % 10;
		System.out.println("두번째마지막자리 : " + 두번째마지막자리);
		저장해보자 += 두번째마지막자리;
		System.out.println("저장해보자 : "+ 저장해보자);
		int 두번째마지막자리없앰 = 처음마지막자리없앰 / 10;
		System.out.println("두번째마지막자리없앰 : "+두번째마지막자리없앰);
		int 세번째마지막자리 = 두번째마지막자리없앰 % 10;
		System.out.println("세번째마지막자리 : " + 세번째마지막자리);
		저장해보자 += 세번째마지막자리;
		System.out.println("저장해보자 : "+ 저장해보자);
		int 세번째마지막자리없앰 = 두번째마지막자리없앰 / 10;
		System.out.println("세번째마지막자리없앰 : "+ 세번째마지막자리없앰);
		int 네번째마지막자리 = 세번째마지막자리없앰 % 10;
		System.out.println("네번째마지막자리 : " + 네번째마지막자리);
		저장해보자 += 네번째마지막자리;
		System.out.println("저장해보자 : "+ 저장해보자);
		int 네번째마지막자리없앰 = 세번째마지막자리없앰 / 10;
		System.out.println("네번째마지막자리없앰 : "+ 네번째마지막자리없앰);
		int 다섯번째마지막자리 = 네번째마지막자리없앰 % 10;
		System.out.println("다섯번째마지막자리 : "+ 다섯번째마지막자리);
		저장해보자 += 다섯번째마지막자리;
		System.out.println("저장해보자 : "+ 저장해보자);
		int 다섯번째마지막자리없앰 = 네번째마지막자리없앰 / 10;
		System.out.println("다섯번째마지막자리없앰 : "+ 다섯번째마지막자리없앰);
		boolean result = (Integer.parseInt(저장해보자) == 처음숫자);
		System.out.println(result);
		*/
		System.out.println("12321 : " + isPalindrome(12321));
		System.out.println("23456 : " + isPalindrome(23456));
		System.out.println("-12321 : " + isPalindrome(-12321));
	}
	
	public static boolean isPalindrome(int number) {
		
		boolean result = false;
		int restNumber = 0;
		int originalNumber = number;
		String reverse = "";
		if(number < 0) {
			number = number *-1;
			System.out.println("number * -1 : " + number);
			originalNumber = number;
			System.out.println("compareNumber : " + originalNumber);
		}
		
		while (number > 0) {
			restNumber = number % 10;
			System.out.println("restNumber : " + restNumber);
			reverse += restNumber;
			System.out.println("reverseStored : " + reverse);
			number = number / 10;
			System.out.println("current number : " + number);
			result = (Integer.parseInt(reverse) == originalNumber);
			if(number == 0) {
				break;
			}
		}
				
		return result;
		
	}

}
