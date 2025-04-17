package question07;

import java.util.Scanner;

public class ChangeMoney {
	public static void main(String[] args) {
		
		
		int res, money;
		int [] unit = {50000, 10000, 1000, 500, 100,50, 10,1};
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("금액을 입력하시오>>");
		money = scanner.nextInt(); // 금액
		
		
		for (int i = 0; i < unit.length; i++) {
			res = money/unit[i];
			
			if (res>0) {
				System.out.println(unit[i]+"원 짜리 "+res+"개");
			}
			money = money%unit[i];
			for (int j = 0; j < unit.length-1; j++) {
				res = money/unit[j+1];
			}
		}
		scanner.close();
	}
}

