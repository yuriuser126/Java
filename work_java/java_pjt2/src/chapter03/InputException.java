package chapter03;

import java.util.Scanner;

/*
 * 정수 3개를 입력받음
 * 정수가 아닌 경우 패스
 * 3개의 합 출력
 * ㅇㅖ외 처리 이용
 */
public class InputException {
	
	public static void main(String[] args) {
		int sum=0, n=0; //입력받는거
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 3개를 입력하시오 : ");
		
		for (int i = 0; i < 3; i++) {
			System.out.print(">>");
			//정순데 정수 안오면 try catch 사용
			try {
					n = scanner.nextInt(); //5가 처음꺼 도장찍혀있음
			} catch (Exception e) {
				System.out.println("정수가 아닙니다. 다시 입력하세요!");
//				break;
				scanner.next();//-정수가 아닌것을 패스시킴
					i--; //무한대를 타버림 - 다시입력받기 위해서 카운트 감소
				continue; //5가 r대신 두번들어감 합계누적 방지
			}
			sum+=n;
			
		}
		System.out.println("합은 : "+sum);
		scanner.close();
		
	}
}
