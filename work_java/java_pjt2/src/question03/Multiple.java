package question03;

import java.util.Scanner;

public class Multiple {
	public static void main(String[] args) {
		
//		int scannerr =0;
		int number=0;
		boolean multiple;
		
		 multiple = false; // 기본은 false
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("양의 정수를 입력하세요 : ");
		number = scanner.nextInt();
		
//		3의 배수(아닌경우(5의배수 or not(8의 배수 or not)));
//		if else if(if else(if else))
		
//		if else if 혹은 else가 만능은아니다.
//		if문만 사용
		
		if (number %3 == 0 ) {
			System.out.println("3의 배수이다.");
			multiple=true;
		}
		
		if (number %5 == 0 ) {
			System.out.println("5의 배수이다.");
			multiple=true;
		}
		
		if (number %8 == 0 ) {
			System.out.println("8의 배수이다.");
			multiple=true;
		}
		
		if (multiple == false ) {
			System.out.println("어느 배수도 아니다.");
		}
		
	/*	if (multiple=true) {
			if (number%3 == 0) {
				System.out.println("3의 배수이다.");
				multiple = true;
			}else if (number%5 == 0) {
				System.out.println("5의 배수이다.");
				multiple = true;
			} else if (number%8 == 0) {
				System.out.println("8의 배수이다.");
				multiple = true;
			} 
			else {
				System.out.println("어느 배수도 아니다.");

			}
		} else {

		}
		*/
		scanner.close();
	}
}
