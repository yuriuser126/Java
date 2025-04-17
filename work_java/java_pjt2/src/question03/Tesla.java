package question03;

import java.util.Scanner;

public class Tesla {
	public static void main(String[] args) {
		
		int tesla=520;
		int num; //수량
		int money; //tesla*num
		int res;//계산된 결과값
		
//		int hundred, ten;
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("매수 수량을 입력하시오 >> ");
		num = scanner.nextInt();
		money = tesla * num; //여기서 계산을 써놓음
		
		
		
		//100달러 짜리 money를 가지고 100 달러 계산
		res = money /100; 

//		100달러 짜리가 1매 이상일때
		if (res > 0) {
			System.out.println("100달러짜리"+res+"매");
		}
		money = money%100;
		
		//10달러 짜리 money를 가지고 100 달러 계산
		res = money/10;
		
		
//		10달러 짜리가 1매 이상일때
		if (res > 0) {
			System.out.println("10달러짜리"+res+"매");
		}
		
	
		scanner.close();
		
	}
}
