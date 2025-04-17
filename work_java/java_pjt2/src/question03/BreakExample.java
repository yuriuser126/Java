package question03;

import java.util.Scanner;

public class BreakExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("exit을 입력하면 종료합니다.");
		
//		String s = scanner.next();
		
		while (true) {// 무한반복
			System.out.print(">>");
			String s = scanner.next();
			
//			입력받은 s 문자열이 exit면 빠져나옴
			if (s.equals("exit")) {
				break;
			}
			
		}
		/*
		while (s != "exit") {
			s = scanner.next();
			break;
		}*/
		System.out.println("종료합니다...");
		scanner.close();
	}
}
