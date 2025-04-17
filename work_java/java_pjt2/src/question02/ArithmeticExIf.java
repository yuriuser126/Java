package question02;

import java.util.Scanner;

public class ArithmeticExIf {
	public static void main(String[] args) {
		System.out.println("연산 >> " );
		Scanner scanner = new Scanner(System.in);
		
//		op.equals("+")
		int op1 = scanner.nextInt();
		String op  = scanner.next();
		int op2 = scanner.nextInt();
		int res=0;
	

		if (op.equals("+")) { // 숫자는 ==<-두개 문자는 =<-하나
			res = op1 + op2;
		}else if (op.equals("-")) {
			res = op1 - op2;
		} else if (op.equals("*")) {
			res = op1 * op2;
		} else if (op.equals("/")) {
			if (op2 == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
				scanner.close();
				return; // 맨 바깥쪽 결과 안나오게 바로 리턴해서 끝냄. 0으로 나눌수 없다로 끝낸다.
			} else {
				res = op1 / op2;
			}
		} 
		else {//없어도됨
			System.out.println("사칙연산이 아닙니다.");
			scanner.close();
			return;
		}
		System.out.println(op1+op+op2+"의 계산 결과는"+res);		
		scanner.close();
	}
}
//		
//		if ((op.equals("+")="+") {
//			return sum;
//		}else if ((op.equals("-")) {
//			return minus;
//		} else if ((op.equals("*")) {
//			return cal;
//		}else if ((op.equals("/")) {
//			return divide;
//		}
//		else {
//			System.out.println("사칙연산을 입력하세요");
//		}
//		
//		System.out.println(a+"+"+b+"의 계산 결과는"+result);		
//		
