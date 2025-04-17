package question01;

import java.util.Scanner;

public class ExExchange {
	public static void main(String[] args) {
		
//		int RATE =1100; // 숫자를 바로 넣어서 계산 햇엇음
//		환율 고정할때 상수 사용(관습적으로 대문자)
		final double DOLLAR_RATE =1200; 
		final double  EUR_RATE=1500;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("원화를 입력하세요(단위 원)>> ");
		int won =scanner.nextInt();
		
		double  dollar = won/DOLLAR_RATE;
		double  euro = won / EUR_RATE;
		System.out.println(won+"원은 $"+dollar+"입니다.");
		System.out.println(won+"원은 E"+euro+"입니다.");
		
		scanner.close();
	}
}
