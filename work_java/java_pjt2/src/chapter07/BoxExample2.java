package chapter07;

public class BoxExample2 {
	public static void main(String[] args) {
		//제네릭 타입파라미터 : String
//		Box2<String> box1=new Box2<String>();
//		자바 7부터 생략가능(다이아몬드 파라미터<>)
		Box2<String> box1=new Box2<>();
		box1.set("hello");
//		컴파일 단계에서 제네릭타입 감지
//		box1.set(777);//오류
		String greet =  box1.get();
		System.out.println(greet);
		
		//레퍼클래스나 일반클래스만 와야함
		//Wrapper 클래스가 와야됨
//		Box2<int> box2=new Box2<>();
		Box2<Integer> box2=new Box2<>();
//		컴파일 단계에서 제네릭타입 감지
//		box2.set("hello");//오류
		box2.set(777);
		//auto unboxing-?
		int value = box2.get();
		System.out.println(value);
		
	}
}
