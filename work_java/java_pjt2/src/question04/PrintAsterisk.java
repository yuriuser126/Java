package question04;

import java.util.Scanner;


public class PrintAsterisk {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("정수를 입력하시오 >> ");
		 
		 int a = scanner.nextInt();
		 
//		 for (int i = 0; i < a ; i++) {//i-- 가 아니라 i++이다..
		 //감소시키는 로직을 위해서 역으로 진행
		 for (int i = a; i > 0 ; i--) {//i-- 가맞았다. 근데 시작이 i=a 이다.
			 //i>0 ->이게 뭐지?-> 54321 0이상까지 
//			 for (int j =0; j <a; j++) { //j<i 가 아니라 j<a 이다...
			 //하나씩 줄이기 위해서 i 값 사용
				 for (int j =0; j <i; j++) { //j<i 가 맞았다..
				System.out.print('*');
				
			}
			 System.out.println(); //엔터를 넣어서 밑으로 내림..
			
		}
		 scanner.close();
		 
		 
	}
}
