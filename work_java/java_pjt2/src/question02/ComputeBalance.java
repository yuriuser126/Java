package question02;

import java.util.Scanner;

public class ComputeBalance {
	public static void main(String[] args) {
		int a;
		int b;

		double  res;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("매수 금액을 입력하세요: ");
		 a = scanner.nextInt();
		
		System.out.println("매도금액을 입력하세요: ");
		 b = scanner.nextInt();

		if (b > a) {
			res =(b - a)*0.22;
		}
		else {
			res = 0;
		}
		System.out.println("양도세 = "+ res );
		scanner.close();
		
		
	}
}
