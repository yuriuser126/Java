package question02;

import java.util.Scanner;

public class ExStock {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("코스피 지수를 입력하세요(1800~2500): ");
//		int a = scanner.nextInt();
		int kospi = scanner.nextInt();

		System.out.println("환율을 입력하세요(1100~1200): ");
//		int b = scanner.nextInt();
		int rate = scanner.nextInt();
		
		
//	
//		if (a>=2200) {
//			System.out.println("상승장");
//			if ((b<1150)&& (a>2300)) {
//				System.out.println("상승장");
//			} 
//			else {
//				System.out.println("횡보장");
//			}
//		} else {
//			System.out.println("하락장");
//		}
		
		

		if (rate < 1150) {
			if ( (kospi>=2300)) {
				System.out.println("상승장");
			} else if (kospi >= 2000) {
				System.out.println("횡보장");
			}
			else {
				System.out.println("하락장");
			}
		} else {
			if ( (kospi>=2200)) {
				System.out.println("상승장");
			} else if (kospi >= 2000) {
				System.out.println("횡보장");
			}
			else {
				System.out.println("하락장");
			}
		}
		scanner.close();
	}
}

