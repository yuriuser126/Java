package chapter05_01;

//일반클래스
//객체 생성자 6개
//public class Duck extends Bird {
//생명1개 , 날개2개, 걷다, 먹는다+수영한다+난다.(인터페이스 다중상속)
	public class Duck extends Bird implements Swim2,Fly {

		@Override
		public void swim() {
		System.out.println("ducks swim.");
		}

		@Override
		public void fly() {
		System.out.println("ducks fly.");
		}
		
//	public void swim() {
//		System.out.println("ducks swim.");
//	}
//	public void fly() {
//		System.out.println("ducks fly.");
//	}
}
