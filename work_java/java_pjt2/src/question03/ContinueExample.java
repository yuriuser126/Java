package question03;

import java.util.Scanner;

public class ContinueExample {
	public static void main(String[] args) {
		int  n, sum =0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 5개를 입력하세요");
		
		for (int i = 0; i <5 ; i++) {
				n = scanner.nextInt();
//				if (n>0) {
//					sum += n ;
//				}
				if (n<0) {
//					i++ 증감쪽으로 이동
					continue;
				}
				else {
					sum += n ;
				}
		}
		System.out.println("양수의 합은"+ sum);
		scanner.close();
	}
}
		
		
