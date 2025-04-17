package chapter05_02;


//turnOn , turnOff : 추상메소드
interface RemoteControl{
	void turnOn();
	void turnOff();
}
public class AnonymouseClassTest {
	public static void main(String[] args) {
		//익명 클래스 정의(인터페이스 이름 사용-> 객체 구현)
		 RemoteControl rc = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("TV turnOn");//추상메소드 오버라이드, 필수
			}
			
			@Override
			public void turnOff() {
				System.out.println("TV turnOff");
				
			}
		};
//		익명 클래스 객체의 메소드 호출
		rc.turnOn();
		rc.turnOff();
	}
}
