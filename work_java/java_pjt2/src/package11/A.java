package package11;

public class A {
	//객체 생성 a1,a2 생성
	A a1 = new A(true); // 매개변수 하나 객체 생성자 호출위해 만듬
	A a2 = new A(1); // 기본생성자 호출  x -> int A클래스
	A a3 = new A("문자열"); // 기본생성자 호출  x -> int A클래스
	
	
//	타입이 다른 오버로딩 할수있따
	//생성자
	public A(boolean b) {
	}
	
	//오버로딩
	A(int b) {//public 없으니까 default 접근 지정자
	}
	
//	private A(String s) {//프라이빗 접근지정자 - 문제없음 private접근지정자
	 A(String s) {//default 접근 지정자
		
	}
	
}
