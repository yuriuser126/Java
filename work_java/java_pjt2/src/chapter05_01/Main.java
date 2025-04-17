package chapter05_01;

public class Main {
	public static void main(String[] args) {
//		new Animal(); //추상클래스는 객체생성 못함
		//일반클래스 아닌가,,/? 여기는..? 추상클래스 안에서 못한느거아닌가
		Animal a; //a: 참조 변수 선언은 된다.
		
//		new Bird();//추상클래스는 객체 생성 못함
		//일반클래스 펭귄은
		Penguin p = new Penguin();
		//멤버5개(life, wing, walk(),eat(),swim())중 수영한다
		p.swim(); //수영을 해볼까요
		
		//펭귄을 슈퍼클래스로 Bird  p2로 받음
		Bird p2 = new Penguin(); //upcasting//타입이 Bird
//		p2.swim();// 업캐스팅은 슈퍼클래스의 멤버만 접근가능(오류발생)!!
		p2.walk(); //슈퍼클래스 Bird에 있어서 가능.
		Penguin p3 = (Penguin)p2;//downcasting//타입이 Penguin, 2개의 펭귄
		p3.swim();//다운캐스팅은 모든멤버 접근가능 !!
		
		
		
		//오리를 조류슈퍼클래스로 받음
		Bird d = new Duck();//upcasting 업캐스팅
		//업캐스팅은 슈퍼클래스의 멤버만 접근가능 / 오리가먹는다
		d.eat(); //같은타입 슈퍼클래스의 멤버로 있으니까 가능!!
		Duck d2 = (Duck) d;//다운캐스팅
		d2.fly();//다운캐스팅은 모든멤버 접근가능!!
		
		//추상클래스를 참조변수 선언(슈퍼클래스) , 인터페이스랑 비슷
		Animal d3 = new Duck();//업캐스팅은 슈퍼클래스의 멤버만 접근가능
		int x = d3.life;
		System.out.println("x->"+x);
		
//		new Swim2() {}; 인터페이스는 객체생성 못한다. 추상클래스도 못함
		Swim2 s = new Penguin();//인터페이스를 참조변수 /upcasting?
		s.swim();
		
		//인터페이스가 인터페이스 배열 2개를 가리킨다.
		//객체배열과 형태가 비슷
		//s2[0],s2[1]
		Swim2[] s2 = new Swim2[2];
		s2[0] = new Penguin(); //s2[0] : 참조변수
		s2[1] = new Duck(); //s2[1] : 참조변수
		s2[0].swim();//penguins swim.
		s2[1].swim();//ducks swim.
		//컴파일 단계는 알수 없고, 런타임 실행시 오류 발생
		//" java.lang.ArrayIndexOutOfBoundsException
		s2[2] = new Penguin(); //오류 :Index 2 out of bounds for length 2

		
	}
}
