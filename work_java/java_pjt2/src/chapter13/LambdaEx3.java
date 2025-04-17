package chapter13;

//스프링에서도 도입됨

//람다식으로 구현할 함수형 인터페이스
interface MyFunction3{
	//추상메소드 print
	void print(); 
}

public class LambdaEx3 {
	public static void main(String[] args) {
		MyFunction3 f=()->{System.out.println("Hello");};//람다식
		f.print();//람다식 호출(람다식 객체에서 print메소드 호출)
		
//매개변수 없음- 바로 호출!!!!!!	
		//int x -> 두번지정하는거랑 똑같음
		f=()->{System.out.println("안녕");};//람다식
		f.print();//람다식 호출(람다식 객체에서 print메소드 호출)

	}
}
