package question01;

import java.util.Scanner;

public class SumMultiply {
	public static void main(String[] args) {
		System.out.print("2개의 정수 입력 >>"); //ln 빼자

		
		Scanner scanner = new Scanner(System.in);
		 int a = scanner.nextInt();
		 int b = scanner.nextInt();
		 
//		 int sum = a+b;
//		 int multiply = a*b;
		 
//		 System.out.println("두 수의 합은"+sum);
//		 System.out.println("두 수의 곱은"+multiply);
		 System.out.println("두 수의 합은"+(a+b));
		 System.out.println("두 수의 곱은"+(a*b));//괄호 안하면 문자열 붙여버림 
		 
		 scanner.close();
		 
	}
}
