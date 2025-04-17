package question03;

import java.util.Scanner;

public class ThreeSixNine {
	public static void main(String[] args) {
		/*
		 * count : 3,6,9 갯수
		 * num :  입력받는 정수
		 * a : 10의 자리
		 * b : 1의 자리
		 */
		
		int count=0, num, a, b;
		
		Scanner scanner =  new Scanner(System.in);
		System.out.println("10~99사이의 정수를 입력하시오>> ");
		num = scanner.nextInt();

		a = num/10;
		b = num%10;
		
//		10의자리 3,6,9일때
		if (a%3 == 0) {
			count++;
		}
//		1의자리 3,6,9 일때 / b  != 0 -> 20 30 
		if (b%3  == 0 &&  b  != 0) {
			count++;
		}
		
		if (count == 2) {
		System.out.println("박수짝짝");
		}else if (count ==1) {
			System.out.println("박수짝");
		}
		else {
			System.out.println("박수없음");
		}
		
		scanner.close();
	}
}
