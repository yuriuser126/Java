package chapter13;

//스프링에서도 도입됨

@FunctionalInterface 
//추상메소드 1개만 쓰도록 체크
//유효하지 않게 검사해줌 두개를 쓰는순간 오류가 뜸

//람다식으로 구현할 함수형 인터페이스
//제네릭 타입 T를 가진 함수형 인터페이스
interface MyFunction5<T>{
	void print(T x);
//	void print2();
}

public class LambdaEx5 {
	public static void main(String[] args) {
		MyFunction5<String> f1=(x)->System.out.println(x);
		f1.print("ABC");
		MyFunction5<Integer> f2=(x)->System.out.println(x);
		f2.print(Integer.valueOf(100));
		//Inteager 객체를 람다식에 넘겨준다.
		
		f2.print(200);
		//auto boxing -> 200을 인티저로 감싸서 보냄 
		
	}

}
