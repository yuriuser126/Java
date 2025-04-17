package chapter05_01;
//일반 클래스
//객체 생성자 멤버 5개
//public class Penguin extends Bird{
//extends Bird, Swim : 다중상속불가
//public class Penguin extends Bird, Swim {//오류
//인터페이스 다중상속됨(implements 키워드를 사용한다.
//생명1개 , 날개2개, 걷다, 먹는다+수영한다.(인터페이스)
public class Penguin extends Bird implements Swim2{

	@Override // 시스템 주석 어노테이션
	public void swim() {
		System.out.println("penguins swim.");
		
	}
//	public void swim() {
//		System.out.println("penguins swim.");
//	}
	
}
