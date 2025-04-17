package question01;

import java.util.Scanner;

public class ExSumMultiply {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("3자리수 정수 입력(100~999>> )");
		
		int n = scanner.nextInt();
		int hundred = n/100;
//		 100의자리 : 나누기 100을새서 몫
		int hundredRest = n%100;
		int ten = hundredRest/10; // 999
//		 10의자리 : 나누기 10을새서 몫
		int one = hundredRest%10;
//		 1의자리 : 나누기 10을해서 나머지

		int sum = hundred+ten;
		int multiply = ten * one;
		
		if (hundred > 0) {
			System.out.println("100의 자리와 10의 자리의 합은"+sum );
			System.out.println("10의 자리와 1의 자리의 합은"+multiply );
		} else {
			System.out.println("세자리 수를 입력해 주세요!");

		}
		scanner.close();
	}
}
