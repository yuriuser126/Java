package chapter13;

import java.util.function.BiFunction;

class Calculator{
	public static int add(int a, int b) {
		return a+b;
		
	}
}
public class BiFunctionTest {
		public static void main(String[] args) {
			//BiFunction 인터페이스는 매개변수 2개를 받고 한개 반환
//			BiFunction<Integer, Integer, Integer>obj=(x1,x2)->x1+x2;
			BiFunction<Integer, Integer, Integer>obj=Calculator::add;
			//:: -> 메소드 참조
			//람다식으로 두개받아서 더함
//			세번째 인티저가 result다
			int result = obj.apply(10, 20); //언박싱
			
			System.out.println("주어진 수의 덧셈:"+result);
		}

}
