package question01;

import java.util.Scanner;

//class 여러개 사용해도 무관
class Aaa{}
class Baa{}
//public class : 자바 파일 안에 두개이상 존재시 오류 The public type Caa must be defined in its own file
//public class Caa{}
//1.JVM이 수많은 class에서 public  class 를 찾아감

public class ExCalculation { //일일이 ctrl+space 해서 타이핑
	public static void aaa() { //public 다 적고 ctrl+space해야 void 넘어감
		System.out.println("777");
	}
	public void bbb() {
		System.out.println("888"); //매소드를 왕창 만들어서 호출
	}
//	2. JVM이 수많은 method 에서 main 메소드를 찾아감
	public static void main(String[] args) {
		System.out.print("2개의 실수 입력>>"); //ln 빼고
		
		Scanner scanner = new Scanner(System.in); //scanner 객체 생성
//		double a = scanner.nextDouble();
//		double b = scanner.nextDouble();
		float a = scanner.nextFloat();
		float b = scanner.nextFloat(); //실수 받는 메소드 float 사용
		
		//문자열로 더하니까 괄호 사용해서 미리 덧셈 연산
		System.out.println("두 수의 덧셈은 "+(a+b));
		System.out.println("두 수의 뺄셈은 "+(a-b));
		System.out.println("두 수의 곱셈은 "+(a*b));
		System.out.println("두 수의 나눗셈은 "+(a/b));
		
		scanner.close();
	}
}
