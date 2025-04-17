package chapter05_02;

interface PhoneInterface2{
	int TIMEOUT=100; 
	 void sendCall();
	 void receiveCall();
	 default void printLogo( ) { 
		 System.out.println("** Phone **");
	 }
	
}

//PCS(ex)016,018,019)
//인터페이스 간의 상속 -> extends 사용
//interface MobilePhoneInterface implements PhoneInterface2{}//오류 implements안됨

//문자를 보내고 받는 기능을 추상메소드로 선언
interface MobilePhoneInterface extends PhoneInterface2{
	void sendSMS();
	void  receiveSMS();
}

//MP3 플레이어 : 음악재생, 정지 기능을 추상메소드로 선언
interface MP3Interface{
	void play();
	void stop();
}

//PDA기기 : 계산기능을 메소드로 구현
class PDA{
	public int calculate(int x, int y) {
		return x+y;
	}
}

class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface{
	@Override //오버라이드 추상메소드 전부구현
	public void sendCall() {
		System.out.println("띠리리리링");
	}
	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니다.");
	}
	@Override
	public void play() {
		System.out.println("음악을 연주합니다.");
	}
	@Override
	public void stop() {
		System.out.println("음악을 중단합니다.");
		
	}
	@Override
	public void sendSMS() {
		System.out.println("문자 갑니다.");
		
	}
	@Override
	public void receiveSMS() {
		System.out.println("문자 봤어요.");
		
	}
	public void schedule() {//별도의 메소드다. 고유의 메소드
		System.out.println("일정 관리합니다.");
	}
}
public class InterfaceEx2 {
	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone();
		phone.printLogo();
		phone.sendCall();
		phone.play();
		System.out.println(phone.calculate(3, 5));//8 아예 넣어서 호출함.
		//그냥 phone.calculate 하면 출력 안됨. return-> syso 로 출력함
		phone.schedule();
		
	}
}
