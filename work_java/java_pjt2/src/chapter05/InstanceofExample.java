package chapter05;



public class InstanceofExample {
	public static void method1(Parent parent) {
//		Parent parent = new Child(); => child 객체를 판단
//		instanceof : 객체가 해당 클래스 타입인지 판단(참, 거짓) 
		if (parent instanceof Child) { //child의 클래스 타입이냐
//			downcasting
			Child child = (Child)parent;
			//child. <-이거 안써서 오류난거다.
			System.out.println("method1 - Child 로 변환성공");
		} else {
			System.out.println("method1 - Child 로 변환실패");

		}
	}
	public static void main(String[] args) {
//		upcasting
		Parent parentA = new Child();
		method1(parentA);//성공
		
		Parent parentB = new Parent();
		method1(parentB);//실패
		
	}
}

//Child 객체 완벽하게 같아야 참으로 출력이 된다.