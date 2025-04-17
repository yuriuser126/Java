package question08;

import java.util.Scanner;

class Add {
	private int a ,b;//필드두개
	//setter로 alt a+ alt r -> 두개합침
	public void setValue (int a, int b) {this.a = a;this.b = b;}
	public int calculate() {return a+b;}
}
 
 class Sub {
		private int a ,b;
		public void setValue(int a, int b) {this.a = a;this.b = b;}
		public int calculate() {return a-b;}
	}
 
 class Mul {
	 private int a ,b;
		public void setValue(int a, int b) {this.a = a;this.b = b;}
		public int calculate() {
//			return a*b;
			return 0;
			}
	}

 class Div {
	 private int a ,b;
		public void setValue(int a, int b) {this.a = a;this.b = b;}
		public double calculate() {
			int res=0;
			try {
				 res= a/b;
			} catch (Exception e) {
				System.out.println("0으로 나눌수 없음");
				return 0;
			}
			return res;
		}
	}
 
public class Calc {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		int result = 0;//double 타입 맞춰줘야함
		
//		while (true) {
			
		
		System.out.print("두 정수와 연산자를 입력하시오>> ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
//		String c = scanner.next();
		char c = scanner.next().charAt(0); //글자 한글자만 따올거니까
		
		/*
		 * if (a==0&&b==0&&c.equals("exit")) { System.out.println("프로그램 종료");
		 * System.exit(0);//프로그램 종료시 나타나는거.
		 * 
		 * }
		 */
		
		switch (c) {
		case '+':Add add = new Add();add.setValue(a, b);System.out.println("결과 : "+add.calculate()); break;
		case '-':Sub sub = new Sub();sub.setValue(a, b);System.out.println("결과 : "+sub.calculate()); break;
		case '*':Mul mul = new Mul();mul.setValue(a, b);System.out.println("결과 : "+ mul.calculate()); break;
		case '/':Div div = new Div();div.setValue(a, b);System.out.println("결과 : "+div.calculate()); break;
			/*
			 * if (b==0) { System.out.println("0으로 나눌수 없음"); break; }else { result =
			 * div.calculate(a, b); System.out.println("결과 : "+result);//result 값 이미 더블을 줌.
			 * break; }
			 */
			
	  default: System.out.println("잘못된 연산자 입니다."); break;
			 
		}		
		scanner.close();
//		System.out.println();
	}
	}

