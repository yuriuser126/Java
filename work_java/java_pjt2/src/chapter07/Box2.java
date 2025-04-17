package chapter07;

//대문자 알파벳T를 타입파라미터로 받은 제네릭
public class Box2<T> {//T 가 String, Integer
	//T 가 String, Integer
	//3.hello
	private T t;//타입파라미터 t의타입으로 사용
	
	//타입 파라미터를 메소드의 리턴 타입으로 사용
	//T 가 String, Integer
	public T get() {
		return t;
	}

	//타입 파라미터를 메소드의 매개변수 타입으로 사용
	//T 가 String, Integer
	public void set(T t) {//1.hello
		this.t = t;//2.hello
	}
}
//매개변수? - 메소드안에서 값 받는 x,y 처럼 변수로 받겠다.