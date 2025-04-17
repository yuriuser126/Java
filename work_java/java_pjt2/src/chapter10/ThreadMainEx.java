package chapter10;

public class ThreadMainEx {
	public static void main(String[] args) {
		String name = Thread.currentThread().getName();//현재 실행중인 스레드의 이름
		long id = Thread.currentThread().getId();//현재 실행중인 스레드의 고유한 번호
		//main 메소드의 스레드 우선순위 초기값은 5
		int priority = Thread.currentThread().getPriority();//현재 실행중인 스레드의 우선순위
		//State : 열거형 인덱스 없이 지정함- 값이 심플
		//RUNNABLE : 스레드 6개 상태중 하나
		Thread.State s = Thread.currentThread().getState();//현재 실행중인 스레드의 상태
		
		System.out.println("현재 스레드 이름 : "+name);
		System.out.println("현재 스레드 ID : "+id);
		System.out.println("현재 스레드 우선순위 값 : "+priority);
		System.out.println("현재 스레드 상태 : "+s);
	}
}
