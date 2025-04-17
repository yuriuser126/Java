package question06;

import java.util.Scanner;

public class PrintAlphabet {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("소문자 알파벳 하나를 입력하시오>>");
		
//		char c = a;
		
		String s = scanner.next();
		char c = s.charAt(0);
		 
		 
//		int b = Integer.parseInt(a);
		
//		a 가 인트 스캐너받음 
		
//		for (char i = 'a' ; i <= 'c'; i++) {//abc 계속반복(c 입력)
			for (char i = c ; i >= 'a'; i--) {//-1씩 감소하면서 이전알파벳 출력 
//			for (char j = 'a'; j <= c ; j++) {
				//입력받은 알파벳부터 하나씩 이전 알파벳으로 반복출력
				for (char j = 'a'; j <= i ; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		scanner.close();
	}
}
