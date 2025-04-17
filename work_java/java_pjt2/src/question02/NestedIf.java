package question02;

import java.util.Scanner;

public class NestedIf {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요(0~100): ");
//		int a  = scanner.nextInt();
		int score  = scanner.nextInt();
		
		System.out.println("학년를 입력하세요(0~100): ");
//		int b = scanner.nextInt();
		int year = scanner.nextInt();
		
		
		if (score >=60) {
			if (year !=  4) {
				System.out.println("합격!"); // 4학년이 아니면 이미 60점이상이라 합격
			}else if (score >=70) {
				System.out.println("합격!"); // 4학년이 남음 score가 70이상이면 합격
			} 
			else {
				System.out.println("불합격!"); // 그것도 아니면 불합
			}
		} else {
			System.out.println("불합격!");
		}
		scanner.close();
	}
}
