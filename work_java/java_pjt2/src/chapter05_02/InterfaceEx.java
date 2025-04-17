package chapter05_02;

//기본 폰, 전화를걸어서 100초동안 응답없으면 타임아웃
//전화 거는기능 받는기능 화면에 폰이라고 출력 만듬
interface PhoneInterface{
//	public static final int TIMEOUT=100;
	int TIMEOUT=100; //public static final 생략
//	public abstract void sendCall();//추상메소드 전화 거는거
	 void sendCall();//public abstract 생략
	 void receiveCall();//public abstract 생략 전화 받는거
//	 default void printLogo( ); //default (일반 메소드)는 구현해야함
	 default void printLogo( ) { //표시하는거 default 사용.
		 System.out.println("** Phone **");
	 }
	
}

//인터페이스로 삼성폰을 만들때 기본은 기능을 사용(전화 걸고 받는것)
//삼성폰만의 뭔가를 할수 있음
class SamsungPhone implements PhoneInterface{//추상 메소드 구현
//추상메소드 오버라이딩 2개 -???모든추상메소드반드시구현
	@Override
	public void sendCall() {
		System.out.println("띠리리리링");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니다.");
		
	}
	public void flash() {
		System.out.println("전화가 불이 켜졌습니다.");
	}
	
}

public class InterfaceEx {
	public static void main(String[] args) {
		SamsungPhone phone=new SamsungPhone();//upcasting 클래스 앞 뒤 다를때 , 객체 생성만 한거임 생성자 호출x
		phone.printLogo();//인터페이스 상속받아서 사용
		phone.sendCall();//추상메소드 구현해서 사용
		phone.receiveCall();//추상메소드 구현해서 사용
		phone.flash();//일반 메소드 구현 삼성폰의 고유의 기능.
	}
}
