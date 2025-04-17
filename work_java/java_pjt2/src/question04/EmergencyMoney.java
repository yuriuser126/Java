package question04;

import java.util.Scanner;

public class EmergencyMoney {
	public static void main(String[] args) {
		
		final int hundred =120000; //100달러 미리계산 final로 고정
		int ten = 12000;
		int res, money, num;


		Scanner scanner= new Scanner(System.in);
		System.out.println("가구수를  입력하시오 >> ");
		num = scanner.nextInt();
		
		
		if (num == 1) {
			money = 400000;
		}else if (num == 2) {
			money = 600000;
		}else if (num == 3) {
			money = 800000;
		}
		else {
			money = 1000000;
		}
// 기준 1가구 2가구 3가구 4가구 먼저 지정해줌 문제 순서대로 작성하자 !!!!!
		
		
		res = money /hundred; 

//		100달러 짜리가 1매 이상일때
		if (res > 0) {
			System.out.println("100달러짜리"+res+"매");
		}
		//나머지 돈을 다시 셋팅
		money = money%hundred;
		
		res = money/ten;
		
//		10달러 짜리가 1매 이상일때
		if (res > 0) {
			System.out.println("10달러짜리"+res+"매");
		}
		scanner.close();
		
	}
}
