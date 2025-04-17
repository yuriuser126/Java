package chapter03;

import java.util.Scanner;

public class DivideByZero {
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dividend;
		int divisor;
		
		//무한반복
		while (true) {
			System.out.println("분자를 입력하시오 >>");
			dividend = scanner.nextInt();
			System.out.println("분모를 입력하시오 >>");
			divisor = scanner.nextInt();
			
			//불능일때 정상적인 메세지로 처리
			//트라이햇을때 문제 생기면 캐치로 잡아
			try {
//				불능이 발생할수 있는 실행문(오류 발생 가능성이 있는 실행문)
				System.out.println(dividend+"를 "+divisor+"로 나누면 몫은 "+dividend/divisor+"입니다.");
				break; //-> 무한반복에서 빠져나가게한다.
//				오류발생시 처리(try에서 발생시)
			} catch (Exception e) {
				System.out.println("0으로 나눌 수 없습니다! 다시 입력하세요.");
			}
		}
		scanner.close(); //무한반복이라 오류남
		

		
	}
}
