package chapter13;

//스프링에서도 도입됨

//람다식으로 구현할 함수형 인터페이스
interface MyFunction2{
	int calc(int x); //람다식으로 구현할 추상메소드
}

public class LambdaEx2 {
	public static void main(String[] args) {
//		MyFunction2 square=(x)->{return x*x;};//람다식
		
		//람다식 매개변수 하나일시 {}중괄호랑 return 매개변수 ()괄호 생략가능
		MyFunction2 square=x-> x*x;
		
		System.out.println(square.calc(3));

	}
}
