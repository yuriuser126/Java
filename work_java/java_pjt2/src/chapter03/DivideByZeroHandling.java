package chapter03;

import java.util.Scanner;

/*
 * 나눗셈(분자, 분모 입력받음)
 * 몫을 출력(분모가 0인경우 불가능)
 */
public class DivideByZeroHandling {
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dividend;
		int divisor;
		
		System.out.println("분자를 입력하시오 >>");
		dividend = scanner.nextInt();
		System.out.println("분모를 입력하시오 >>");
		divisor = scanner.nextInt();
		
//		분자를 입력하시오 >>
//		10
//		분모를 입력하시오 >>
//		0
//		Exception in thread "main" java.lang.ArithmeticException: / by zero
//			at chapter04.DivideByZero.main(DivideByZero.java:22)

		
		System.out.println(dividend+"를 "+divisor+"로 나누면 몫은 "+dividend/divisor+"입니다.");
		scanner.close();
		
	}
}
