package controlFlow;

public class DigitSumChallenge {

	public static void main(String[] args) {
		
		int i = 1234;
		int 처음나눈몫 = 0;
		int 처음나눈나머지 = 0;
		int 두번째몫, 두번째나머지;
		int 세번째몫, 세번째나머지;
		int a = 10;
		int total = 0;
		
		처음나눈몫 = i / 10;
		처음나눈나머지 = i % 10;	
		System.out.println("처음나눈몫 : " + 처음나눈몫);
		System.out.println("처음나눈나머지 : " + 처음나눈나머지);
		total +=처음나눈나머지;
		System.out.println("total : " + total);
		
		두번째몫 = 처음나눈몫 / a;
		두번째나머지 = 처음나눈몫 % a;
		System.out.println("두번째몫 : " + 두번째몫);
		System.out.println("두번째나머지 : " + 두번째나머지);
		total+=두번째나머지;
		System.out.println("total : " + total);
		
		세번째몫 = 두번째몫 / a;
		세번째나머지 = 두번째몫 % a;
		System.out.println("세번째몫 = " + 세번째몫);
		System.out.println("세번째나머지 = " + 세번째나머지);
		total += 세번째나머지;
		System.out.println("total : " + total);

		total +=세번째몫;
		System.out.println("total : " + total);
		
		System.out.println("결과 : " + sumDigits(-12345));
		
	}
	
	public static int sumDigits(int number) {
		
		int total = 0;
		int ten = 10;
		
		if(number < 0) {
			total = -1;
		}
		
		while(number > 0) {
			
			total += number % ten;
			System.out.println("합계 : " + total);
			
			number = number / ten;
			System.out.println("number : " + number);
			System.out.println("나머지 : " + number % ten);
			
		}
		System.out.println("최종합계 : " + total);
		return total;
	}
	

}
