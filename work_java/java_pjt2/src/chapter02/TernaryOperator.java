package chapter02;

public class TernaryOperator {
	public static void main(String[] args) {
		int a=3, b=5;
//		a>b 가 거짓이므로 b-a 반환 - 삼항연산자
		System.out.println("두 수의 차는"+ ((a >b)?(a>b):(b-a)));
	}
}
