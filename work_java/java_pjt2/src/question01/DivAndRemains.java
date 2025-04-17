package question01;

import java.util.Scanner;

public class DivAndRemains {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("2자리수 정수 입력(10~99)>> ");
		 
//		 10d의자리 : 나누기 10을새서 몫
//		 1의자리 : 나누기 10을해서 나머지
		 int n = scanner.nextInt();
		 int ten = n/10;
		 int one = n%10;
		 
		 if (ten == one ) {
			 System.out.println( "Yes! 10의 자리와 1의 자리가 같습니다. ");
		} else {
			System.out.println( "No! 10의 자리와 1의 자리가 다릅니다. ");
			
		}
		 scanner.close();
	}
}
