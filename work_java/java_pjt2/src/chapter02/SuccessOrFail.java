package chapter02;

import java.util.Scanner;

/*
 * 점수를 입력받아서 80점 이상이면 합격
 */
public class SuccessOrFail {
	 public static void main(String[] args) {
		 System.out.print("점수를 입력하시오 : ");
		 Scanner scanner = new Scanner(System.in);
		 int score =scanner.nextInt();
		 
//		 //80점 이상인 경우
//		 if (score >= 80 ) {
//			 System.out.println("축하합니다! 합격입니다.");
//			
//		}
//		 if (score >= 80 ) -> 중괄호 없어도 가능
//			 System.out.println("축하합니다! 합격입니다.");
//			 
//		실행문 2개이상일때 조건이 거짓이면 오류발생 마지막 프린트 출력됨
//		 if (score >= 80 ) {//-> 중괄호 생략 못함.
//			 System.out.println("축하합니다!");
//			 System.out.println("합격입니다."); } //점수 낮은데 합격입니다가 뜸
//		 
///	 
//	
//			실행문 2개이상일때 조건이 거짓이면 오류발생 마지막 프린트 출력됨
		 if (score >= 80 ) { System.out.println("축하합니다!"); System.out.println("합격입니다.");}
			 

		 scanner.close();
		
	}
}
