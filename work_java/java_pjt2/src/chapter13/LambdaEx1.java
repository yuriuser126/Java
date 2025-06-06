package chapter13;

//스프링에서도 도입됨

//람다식으로 구현할 함수형 인터페이스
interface MyFunction{
	int calc(int x, int y); //람다식으로 구현할 추상메소드
}

public class LambdaEx1 {
	public static void main(String[] args) {
		MyFunction add=(x,y)->{return x+y;};//람다식
//		MyFunction minus=(x,y)->{return x-y;};//람다식
		//람다식 {}와 return 생략
		MyFunction minus=(x,y)-> x-y;
		
		//합 구하기(람다식 객체에서 calc 메소드 호출)
		System.out.println(add.calc(1, 2));
		//차 구하기(람다식 객체에서 calc 메소드 호출)
		System.out.println(minus.calc(1, 2));
	}
}
