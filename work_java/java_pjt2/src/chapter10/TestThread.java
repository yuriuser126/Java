package chapter10;

public class TestThread {
	public static void main(String[] args) {
//		스레드 객체생성
		TimerThread th=new TimerThread();
//		스레드 실행되면서 JVM 스케줄링
		th.start();//start하면 run 메소드 호출
		
	}

}
