package question02;

import java.util.Scanner;

public class ArithmeticExSwitch {
	public static void main(String[] args) {
		System.out.println("연산 >> " );
		Scanner scanner = new Scanner(System.in);
		
		int op1 = scanner.nextInt();
		String op  = scanner.next();
		int op2 = scanner.nextInt();
		int res=0;

		
		switch (op) { // op로 직접 부여
		case "+": res = op1 + op2; break;
		case "-": res = op1 - op2; break;
		case "*": res = op1 * op2; break;
		case "/": //switch 안에  switch 안됨
			if (op2 == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
				scanner.close();
				return; 
			} else {
				res = op1 / op2;
			}
			break;
			
		default:
			System.out.println("사칙연산이 아닙니다.");
//			break;
		}


		System.out.println(op1+op+op2+"의 계산 결과는"+res);		
		scanner.close();
	}
}