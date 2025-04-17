package question01;

import java.util.Scanner;

public class Won2Dollar {
	public static void main(String[] args) {
		
		final int  RATE =1100;  // 숫자를 바로 넣어서 계산 햇엇음 
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("원화를 입력하세요(단위 원)>> ");
		int won =scanner.nextInt();
		
//		float dollar = won/1100;
//		float dollar = won/rate;
		double  dollar = won/RATE;
		System.out.println(won+"원은"+"$"+dollar+"입니다.");
		
		scanner.close();
	}
}
