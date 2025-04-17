package chapter07;

public class BoxExample {
	public static void main(String[] args) {
		Box box = new  Box(); //upcasting
		Object box2 = new  Box(); //upcasting -> Object 조상 타입이라 자동업캐스팅
		box.set("홍길동");//스트링-
		//down casting(String)
		String name = (String)box.get(); //downcasting
		System.out.println(name);
		
		box.set(777);
		//down casting(int)
		int number = (int)box.get();
		System.out.println(number);
		
		//Apple 객체
		box.set(new Apple());
		//down casting(Apple)
		Apple apple =(Apple) box.get();
		//chapter07.Apple@5ca881b5
		System.out.println(apple);//16진수
	}
}
