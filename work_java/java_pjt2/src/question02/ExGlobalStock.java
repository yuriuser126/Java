package question02;

import java.util.Scanner;

public class ExGlobalStock {
	public static void main(String[] args) {
		
		int purchaseAmount; 
		int balance ;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("구매 금액을 입력하세요: ");
		purchaseAmount = scanner.nextInt();
		
		
		System.out.println("청구금액을 입력하세요: ");
//		int balance = scanner.nextInt();
//		int res = 0;
		
//		구매금액이 30만원 이상일때
		if (purchaseAmount >= 300000) {
			balance = purchaseAmount - 30000;
//			청구금액은 3만원 할인
//			System.out.println("구매금액 = "+ purchaseAmount);
//			System.out.println("청구금액 ="+balance);
		}else if (purchaseAmount<3000000 && purchaseAmount>=100000) {
			balance = purchaseAmount - 5000;
//			System.out.println("구매금액 = "+ purchaseAmount);
//			System.out.println("청구금액 ="+balance);
		}
//		else if (purchaseAmount<100000) {
//			balance = purchaseAmount;
//			System.out.println("구매금액 = "+ purchaseAmount);
//			System.out.println("청구금액 ="+balance);
//		} 
		else {
			balance = purchaseAmount;
		}
			System.out.println("구매금액 = "+ purchaseAmount);
			System.out.println("청구금액 ="+balance);
		
		
		
		scanner.close();
		
		
	}
}
